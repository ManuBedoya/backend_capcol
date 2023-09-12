package org.capcol.core.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServices {

    public String getUsers(){
        return "users";
    }
    
}
