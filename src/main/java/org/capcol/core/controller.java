package org.capcol.core;

import org.capcol.core.services.ProductServices;
import org.capcol.core.services.UserServices;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1")
public class controller {

    @Inject
    ProductServices productService;
    @Inject
    UserServices userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/users")
    public String getUsers() {
        return userService.getUsers();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products")
    public String getProducts(){
        return productService.getProducts();
    }
}
