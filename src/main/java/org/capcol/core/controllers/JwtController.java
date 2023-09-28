package org.capcol.core.controllers;

import org.capcol.core.services.JwtServices;
import org.capcol.domain.model.jwt.JwtModel;
import org.capcol.util.Constants;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(Constants.BASE_PATH_JWT)
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JwtController {

    @Inject
    JwtServices jwtServices;

    @POST
    @PermitAll
    @WithSession
    @Path("/generate-token")
    public Uni<String> generateUserToken(JwtModel data) {
        return Uni.createFrom().item(jwtServices.generateToken(data));
    }

}
