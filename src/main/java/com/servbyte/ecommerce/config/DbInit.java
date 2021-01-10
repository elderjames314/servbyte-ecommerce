package com.servbyte.ecommerce.config;

import com.servbyte.ecommerce.dtos.CitiesDto;
import com.servbyte.ecommerce.entities.Cities;
import com.servbyte.ecommerce.repository.CitiesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class DbInit {
    private final CitiesRepository citiesRepository;

    public DbInit(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    @PostConstruct
    private void creatCities(){

        List<CitiesDto> citiesList = Arrays.asList(new CitiesDto("LAGOS"),
                new CitiesDto("ABUJA"), new CitiesDto("IBADAN"), new CitiesDto("UYO"),
                new CitiesDto("PORTHACOURT"), new CitiesDto("ENUGU"), new CitiesDto("ASABA"),
                new CitiesDto("KANO"), new CitiesDto("UMUAHIA"), new CitiesDto("ABA"), new CitiesDto("OWERRI"));

        citiesList.forEach(city -> {
            Cities cities = new Cities();
            BeanUtils.copyProperties(city, cities);
            citiesRepository.save(cities);
        });

    }
}
