package com.servbyte.ecommerce.config;

import com.servbyte.ecommerce.dtos.CitiesDto;
import com.servbyte.ecommerce.entities.Cities;
import com.servbyte.ecommerce.entities.Roles;
import com.servbyte.ecommerce.repository.CitiesRepository;
import com.servbyte.ecommerce.repository.RoleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class DbInit {
    private final CitiesRepository citiesRepository;
    private final RoleRepository roleRepository;

    public DbInit(CitiesRepository citiesRepository, RoleRepository roleRepository) {
        this.citiesRepository = citiesRepository;
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    private void creatCities(){

        List<CitiesDto> citiesList = Arrays.asList(new CitiesDto("LAGOS"),
                new CitiesDto("ABUJA"), new CitiesDto("IBADAN"), new CitiesDto("UYO"),
                new CitiesDto("PORT HACOURT"), new CitiesDto("ENUGU"), new CitiesDto("ASABA"),
                new CitiesDto("KANO"), new CitiesDto("UMUAHIA"), new CitiesDto("ABA"), new CitiesDto("OWERRI"));

        citiesList.forEach(city -> {
            Cities cities = new Cities();
            BeanUtils.copyProperties(city, cities);
            citiesRepository.save(cities);
        });

    }

//    @PostConstruct
//    private void createRoles(){
//        List<Roles> rolesList = Arrays.asList(new Roles("RESTAURANT", "Restaurant"),
//                new Roles("User", "User"), new Roles("LOGISTICS", "Delivery company"),
//                new Roles("ADMIN", "All access granted"));
//
//        rolesList.forEach(role -> {
//            roleRepository.save(role);
//        });
//
//    }
}
