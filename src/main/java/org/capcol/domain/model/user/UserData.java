package org.capcol.domain.model.user;

import lombok.Data;

@Data
public class UserData {

    private Long id;
    private String name;
    private String email;
    private String address;
    private String city;
    private String department;
    private String gender;
    private String phone;

}
