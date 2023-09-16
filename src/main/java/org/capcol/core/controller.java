package org.capcol.core;

import java.util.List;

import org.capcol.core.services.ProductServices;
import org.capcol.core.services.UserServices;
import org.capcol.infraestructure.panache.product.ProductEntity;
import org.capcol.infraestructure.panache.user.UserEntity;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class controller {

    @Inject
    ProductServices productService;
    @Inject
    UserServices userService;

    @GET
    @Path("/users")
    @WithSession
    public Uni<List<UserEntity>> getUsers() {
        return userService.getUsers();
    }

    @GET
    @Path("/products")
    @WithSession
    public Uni<List<ProductEntity>> getProducts() {
        return productService.getProducts();
    }
}
