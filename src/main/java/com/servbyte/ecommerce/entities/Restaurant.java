package com.servbyte.ecommerce.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "restaurants")
public class Restaurant extends AbstractEntity{
    private String restaurantName;
    private String restaurantEmail;
    private String restaurantLogo;
    @ElementCollection
    private List<String> cities;
    private String restaurantPhoneNumber;
    @ManyToOne
    private ApplicationUser applicationUser;
    @OneToMany
    Collection<RestaurantMenu> menuCollections;

}
