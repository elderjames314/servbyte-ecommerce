package com.servbyte.ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "restaurants")
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant extends AbstractEntity{
    private String restaurantName;
    private String restaurantEmail;
    private String restaurantLogo;
    @OneToMany
    private List<Cities> listOfCities;
    private String restaurantPhoneNumber;
    @ManyToOne
    private ApplicationUser applicationUser;
    @OneToMany
    Collection<RestaurantMenu> menuCollections;


}
