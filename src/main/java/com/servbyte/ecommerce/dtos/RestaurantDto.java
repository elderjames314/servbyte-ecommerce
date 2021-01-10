package com.servbyte.ecommerce.dtos;

import lombok.Data;

import java.util.List;

@Data
public class RestaurantDto {
    private String restaurantName;
    private String restaurantEmail;
    private String restaurantLogo;
    private List<String> listOfCities;
    private String phoneNumber;
}
