package com.servbyte.ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "restaurant_orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order extends AbstractEntity {
    private int deliveryTime;
    @ManyToOne
    private ApplicationUser applicationUser;
    @OneToMany
    private List<RestaurantMenu> restaurantMenu;
    @ManyToOne
    private Logistics logistics;
}
