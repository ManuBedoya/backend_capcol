package org.capcol.infraestructure.panache.product;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Cacheable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity extends PanacheEntity {

    @Column(name = "identification", unique = true)
    private String identification;
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
