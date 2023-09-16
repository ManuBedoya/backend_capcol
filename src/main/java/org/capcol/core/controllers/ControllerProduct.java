package org.capcol.core.controllers;

import java.util.List;

import org.capcol.core.ControllerResource;
import org.capcol.core.services.ProductServices;
import org.capcol.infraestructure.panache.product.ProductEntity;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@ApplicationScoped
public class ControllerProduct implements ControllerResource {

    @Inject
    ProductServices productService;

    @GET
    @Path("/products")
    @WithSession
    public Uni<List<ProductEntity>> getProducts() {
        return productService.getProducts();
    }
}
