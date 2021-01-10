package com.servbyte.ecommerce.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "restaurant_orders")
public class Order extends AbstractEntity {
    private int deliveryTime;
    @ManyToOne
    private ApplicationUser applicationUser;
    @OneToMany
    private List<RestaurantMenu> restaurantMenu;
    @ManyToOne
    private Logistics logistics;
}
