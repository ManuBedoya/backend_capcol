package org.capcol.core.controllers;

import java.util.List;
import org.capcol.core.services.UserServices;
import org.capcol.infraestructure.panache.user.UserEntity;
import org.capcol.util.Constants;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(Constants.BASE_PATH_USERS)
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserServices userServices;

    @GET
    @WithSession
    @RolesAllowed({ Constants.ADMIN })
    public Uni<List<UserEntity>> getUsers() {
        return userServices.getUsers();
    }

    @GET
    @Path("/{username}")
    @WithSession
    public Uni<UserEntity> getUser(String username) {
        return userServices.getUser(username);
    }

    @POST
    @WithTransaction
    public Uni<UserEntity> createUser(UserEntity user) {
        return userServices.createUser(user);
    }

}