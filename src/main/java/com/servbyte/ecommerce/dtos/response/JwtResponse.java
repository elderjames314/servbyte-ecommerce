package com.servbyte.ecommerce.dtos.response;

import lombok.Data;

@Data
public class JwtResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String accessToken;
}
