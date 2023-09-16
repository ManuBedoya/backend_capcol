package org.capcol.infraestructure.panache.user;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;

@Entity
@Table(name = "users")
@Cacheable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends PanacheEntity {

    @Column(name = "identification", unique = true)
    private String identification;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "department")
    private String department;
    @Column(name = "gender")
    private String gender;
    @Column(name = "phone")
    private String phone;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "password")
    private String password;
}