package com.servbyte.ecommerce.config;

import com.servbyte.ecommerce.entities.Cities;
import com.servbyte.ecommerce.entities.Roles;
import com.servbyte.ecommerce.repository.CitiesRepository;
import com.servbyte.ecommerce.repository.RoleRepository;
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
        List<Cities> citiesList = Arrays.asList(new Cities("LAGOS"),
                new Cities("ABUJA"), new Cities("IBADAN"), new Cities("UYO"),
                new Cities("PORT HACOURT"), new Cities("ENUGU"), new Cities("ASABA"),
                new Cities("KANO"), new Cities("UMUAHIA"), new Cities("ABA"), new Cities("OWERRI"));

        citiesList.forEach(city -> {
            citiesRepository.save(city);
        });

    }

    @PostConstruct
    private void createRoles(){
        List<Roles> rolesList = Arrays.asList(new Roles("RESTAURANT", "Restaurant"),
                new Roles("User", "User"), new Roles("LOGISTICS", "Delivery company"),
                new Roles("ADMIN", "All access granted"));

        rolesList.forEach(role -> {
            roleRepository.save(role);
        });

    }
}
