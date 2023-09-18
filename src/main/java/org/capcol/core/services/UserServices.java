package org.capcol.core.services;

import org.capcol.infraestructure.panache.user.UserEntity;
import org.capcol.infraestructure.panache.user.UserRepository;

import java.util.List;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserServices {

    @Inject
    UserRepository userRepository;

    public Uni<List<UserEntity>> getUsers() {
        return userRepository.listAll();
    }

    public Uni<UserEntity> createUser(UserEntity user) {
        return userRepository.persist(user);
    }

}
