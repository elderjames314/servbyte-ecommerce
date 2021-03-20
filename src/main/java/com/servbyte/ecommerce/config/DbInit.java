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

<<<<<<< HEAD
    

    public DbInit(CitiesRepository citiesRepository, RoleRepository roleRepository) {
=======
    public DbInit(CitiesRepository citiesRepository) {
>>>>>>> dc0e3030f2dea720731edf99656ddfe7d6b6388d
        this.citiesRepository = citiesRepository;
    }

    @PostConstruct
    private void creatCities(){

<<<<<<< HEAD
    //     List<CitiesDto> citiesList = Arrays.asList(new CitiesDto("LAGOS"),
    //             new CitiesDto("ABUJA"), new CitiesDto("IBADAN"), new CitiesDto("UYO"),
    //             new CitiesDto("PORT HACOURT"), new CitiesDto("ENUGU"), new CitiesDto("ASABA"),
    //             new CitiesDto("KANO"), new CitiesDto("UMUAHIA"), new CitiesDto("ABA"), new CitiesDto("OWERRI"));

    //    citiesList.forEach(city -> {
    //        Cities cities = new Cities();
    //        BeanUtils.copyProperties(city, cities);
    //        citiesRepository.save(cities);
    //    });
       
    Cities lagos =  new Cities("LAGOS");
    Cities abuja =  new Cities("ABUJA");
    Cities ibadan =  new Cities("IBADAN");
    Cities uyo =  new Cities("UYO");
    Cities portHarcourt =  new Cities("PORT HACOURT");
    Cities enugu =  new Cities("ENUGU");
    Cities asaba =  new Cities("ASABA");
    Cities kano =  new Cities("KANO");
    Cities umuahia =  new Cities("UMUAHIA");
    Cities owerri =  new Cities("OWERRI");
=======
        List<CitiesDto> citiesList = Arrays.asList(new CitiesDto("LAGOS"),
                new CitiesDto("ABUJA"), new CitiesDto("IBADAN"), new CitiesDto("UYO"),
                new CitiesDto("PORTHACOURT"), new CitiesDto("ENUGU"), new CitiesDto("ASABA"),
                new CitiesDto("KANO"), new CitiesDto("UMUAHIA"), new CitiesDto("ABA"), new CitiesDto("OWERRI"));
>>>>>>> dc0e3030f2dea720731edf99656ddfe7d6b6388d

    List<Cities> listCities = Arrays.asList(lagos, abuja, ibadan, uyo, portHarcourt,enugu,asaba,kano,umuahia,owerri);
    citiesRepository.saveAll(listCities);

    }
}
