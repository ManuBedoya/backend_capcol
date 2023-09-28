package org.capcol.core.controllers;

import java.util.List;
import org.capcol.core.services.ProductServices;
import org.capcol.infraestructure.panache.product.ProductEntity;
import org.capcol.util.Constants;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(Constants.BASE_PATH_PRODUCTS)
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    ProductServices productService;

    @GET
    @PermitAll
    @WithSession
    public Uni<List<ProductEntity>> getProducts() {
        return productService.getProducts();
    }

    @GET
    @Path("/{id}")
    @PermitAll
    @WithSession
    public Uni<ProductEntity> getProducts(Long id) {
        return productService.getProduct(id);
    }

    @POST
    @WithTransaction
    @RolesAllowed({ Constants.ADMIN, Constants.SERVICE })
    public Uni<ProductEntity> createProduct(ProductEntity product) {
        return productService.createProduct(product);
    }
}
