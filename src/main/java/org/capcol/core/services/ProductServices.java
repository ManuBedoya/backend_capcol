package org.capcol.core.services;

import java.util.List;

import org.capcol.infraestructure.panache.product.ProductEntity;
import org.capcol.infraestructure.panache.product.ProductRepository;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProductServices {

    @Inject
    ProductRepository productRepository;

    public Uni<List<ProductEntity>> getProducts() {
        return productRepository.listAll();
    }

    public Uni<ProductEntity> createProduct(ProductEntity product) {
        return productRepository.persist(product);
    }

    public Uni<ProductEntity> getProduct(Long id) {
        return productRepository.findById(id);
    }

}
