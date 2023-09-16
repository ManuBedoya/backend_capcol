package org.capcol.core.services;

import java.util.List;

import org.capcol.infraestructure.panache.product.ProductEntity;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductServices {

    public Uni<List<ProductEntity>> getProducts() {
        return ProductEntity.listAll();
    }

}
