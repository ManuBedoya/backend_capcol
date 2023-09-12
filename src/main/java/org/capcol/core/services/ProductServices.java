package org.capcol.core.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductServices {
    
    public String getProducts(){
        return "products";
    }

}
