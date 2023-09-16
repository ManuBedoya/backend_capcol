package org.capcol.infraestructure.panache.product;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
@Cacheable
public class ProductEntity extends PanacheEntityBase {

    @Id
    @Column(name = "id", unique = true)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "ammount")
    private int ammount;
    @Column(name = "price")
    private double price;
    @Column(name = "img")
    private String img;
    @Column(name = "applyVariants")
    private boolean applyVariants;
    @Column(name = "variants")
    private String variants;
}
