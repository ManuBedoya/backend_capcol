package org.capcol.domain.model.jwt;

import lombok.Data;

@Data
public class JwtModel {

    private String identification;
    private String role;
    private String username;

}
