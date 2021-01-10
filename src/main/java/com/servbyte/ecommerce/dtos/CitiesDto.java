package com.servbyte.ecommerce.dtos;

import lombok.Data;

@Data
public class CitiesDto {
    private String name;

    public CitiesDto(String name) {
        this.name = name;
    }
}
