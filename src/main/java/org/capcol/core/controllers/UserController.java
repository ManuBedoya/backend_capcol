package org.capcol.core.controllers;

import java.util.List;

import org.capcol.core.ControllerResource;
import org.capcol.core.services.UserServices;
import org.capcol.infraestructure.panache.user.UserEntity;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@ApplicationScoped
public class UserController implements ControllerResource {

    @Inject
    UserServices userServices;

    @GET
    @Path("/users")
    @WithSession
    public Uni<List<UserEntity>> getUsers() {
        return userServices.getUsers();
    }

}