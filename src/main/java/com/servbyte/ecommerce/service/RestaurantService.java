package com.servbyte.ecommerce.service;

import com.servbyte.ecommerce.dtos.RestaurantDto;
import com.servbyte.ecommerce.entities.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RestaurantService {
     void registerRestaurant(Optional<RestaurantDto> restaurantDto);
     List<Restaurant> findRestaurantsByCity(String city);
}
