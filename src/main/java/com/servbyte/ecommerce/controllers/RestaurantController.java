package com.servbyte.ecommerce.controllers;

import com.servbyte.ecommerce.entities.Cities;
import com.servbyte.ecommerce.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/all-cities")
    public ResponseEntity<?> fetchAllCities(){
        return ResponseEntity.ok(restaurantService.fetchAllCities());
    }
}
