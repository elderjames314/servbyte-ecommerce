package com.servbyte.ecommerce.dtos;

import com.servbyte.ecommerce.entities.Roles;
import lombok.Data;

import java.util.Set;

@Data
public class ApplicationUserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String password;
    private String phoneNumber;
    private Set<Roles> roles;
}
