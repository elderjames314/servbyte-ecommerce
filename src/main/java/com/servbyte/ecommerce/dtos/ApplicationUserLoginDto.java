package com.servbyte.ecommerce.dtos;

import lombok.Data;

@Data
public class ApplicationUserLoginDto {
    private String email;
    private String password;
}
