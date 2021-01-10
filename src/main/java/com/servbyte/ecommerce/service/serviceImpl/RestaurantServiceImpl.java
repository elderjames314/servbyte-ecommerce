package com.servbyte.ecommerce.service.serviceImpl;

import com.servbyte.ecommerce.dtos.RestaurantDto;
import com.servbyte.ecommerce.entities.Restaurant;
import com.servbyte.ecommerce.enums.ApiErrorCodes;
import com.servbyte.ecommerce.exceptions.BadRequestException;
import com.servbyte.ecommerce.repository.RestaurantRepository;
import com.servbyte.ecommerce.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void registerRestaurant(Optional<RestaurantDto> restaurantDto){
        Restaurant restaurant = new Restaurant();
        if(restaurantDto.isPresent()){
            BeanUtils.copyProperties(restaurantDto, restaurant);
            restaurant.setCreatedDate(LocalDateTime.now());
            logger.info("Restaurant owner has been registered {}" + restaurant);
        }else throw new BadRequestException(ApiErrorCodes.INVALID_REQUEST.getKey(), "User should not be empty");

    }

    @Override
    public List<Restaurant> findRestaurantsByCity(String city){
        if(!city.isEmpty() && Objects.nonNull(city)){
            return restaurantRepository.findByCities(city);
        }
        throw new BadRequestException(ApiErrorCodes.INVALID_REQUEST.getKey(), "city cannot be empty");
    }

}
