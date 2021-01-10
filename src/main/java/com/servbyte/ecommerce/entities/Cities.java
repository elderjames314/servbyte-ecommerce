package com.servbyte.ecommerce.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "restaurant_cities")
public class Cities extends AbstractEntity {
    private String name;

    public Cities(String name){
        this.name = name;
    }

    public Cities() {
    }
}
