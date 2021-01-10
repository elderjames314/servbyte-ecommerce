package com.servbyte.ecommerce.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "restaurant_orders")
public class Order extends AbstractEntity {
    private String deliveryTime;
    @OneToOne
    private ApplicationUser applicationUser;
    @OneToMany
    private List<RestaurantMenu> restaurantMenu;
    @OneToOne
    private Logistics logistics;
}
