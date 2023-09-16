package org.capcol.core.services;

import org.capcol.infraestructure.panache.user.UserEntity;
import java.util.List;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServices {

    public Uni<List<UserEntity>> getUsers() {
        return UserEntity.listAll();
    }

}
