package org.capcol.core.services;

import org.capcol.domain.model.jwt.JwtModel;
import org.capcol.util.Constants;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.jwt.Claims;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;

import jakarta.enterprise.context.ApplicationScoped;

import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

@ApplicationScoped
public class JwtServices {

    //@ConfigProperty(name = "mp.jwt.verify.issuer")
    private String isUser;

    private static final Logger adapter = Logger.getLogger(JwtServices.class.getName());

    public String generateToken(JwtModel jwtModel) {
        String role = jwtModel.getRole().toUpperCase();
        if (role.equals(Constants.ADMIN) || role.equals(Constants.SERVICE) || role.equals(Constants.USER)) {
            try {
                JwtClaims jwc = new JwtClaims();
                jwc.setIssuer(isUser);
                jwc.setJwtId(UUID.randomUUID().toString());
                jwc.setSubject(jwtModel.getIdentification());
                jwc.setClaim(Claims.upn.name(), jwtModel.getIdentification());
                jwc.setClaim(Claims.preferred_username.name(), jwtModel.getUsername());
                jwc.setClaim(Claims.groups.name(), Arrays.asList(jwtModel.getRole()));
                jwc.setAudience("using-jwt");
                jwc.setExpirationTimeMinutesInTheFuture(60);

                return generateTokenString(jwc);
            } catch (Exception e) {
                adapter.info("ERROR: Configuracion al generar el JWT");
                return "Error al generar el JWT... intentelo mas tarde";
            }
        } else {
            return "Rol no permitido";
        }
    }

    public String generateTokenString(JwtClaims claims) throws Exception {

        PrivateKey privateKey = readPrivateKey("/privateKey.pem");
        return generateTokenString(privateKey, "/privateKey.pem", claims);

    }

    public String generateTokenString(PrivateKey privateKey, String location, JwtClaims claims) throws Exception {
        long currentTimeInSecs = (int) (System.currentTimeMillis() / 1000);
        claims.setIssuedAt(NumericDate.fromSeconds(currentTimeInSecs));
        claims.setClaim(Claims.auth_time.name(), NumericDate.fromSeconds(currentTimeInSecs));

        for (Map.Entry<String, Object> entry : claims.getClaimsMap().entrySet()) {
            System.out.printf("\tAdded Claim: %s, value %s,\n", entry.getKey(), entry.getValue());
        }

        JsonWebSignature jws = new JsonWebSignature();
        jws.setPayload(claims.toJson());
        jws.setKey(privateKey);
        jws.setKeyIdHeaderValue(location);
        jws.setHeader("typ", "JWT");
        jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);

        return jws.getCompactSerialization();
    }

    public PrivateKey readPrivateKey(String location) throws Exception {
        InputStream content = JwtServices.class.getResourceAsStream(location);
        byte[] aux = new byte[4096];

        int lenght = content.read(aux);

        return decodePrivateKey(new String(aux, 0, lenght, "UTF-8"));
    }

    public PrivateKey decodePrivateKey(String pemEncoded) throws Exception {
        byte[] encodeBytes = toEncodedBytes(pemEncoded);

        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encodeBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(keySpec);
    }

    public byte[] toEncodedBytes(String pemEncoded) {
        String pem = pemEncoded.replaceAll("-----BEGIN (.*)-----", "");
        pem = pem.replaceAll("-----END (.*)----", "");
        pem = pem.replaceAll("\r\n", "");
        pem = pem.replaceAll("\n", "");
        pem = pem.trim();
        return Base64.getDecoder().decode(pem);
    }

}
