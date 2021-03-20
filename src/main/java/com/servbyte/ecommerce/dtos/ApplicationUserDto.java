package com.servbyte.ecommerce.dtos;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;

@Data
public class ApplicationUserDto {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String email;
    @NotBlank
    private String city;
    @NotBlank
    private String password;
    private String phoneNumber;
    @NotBlank
    private String role;
}
