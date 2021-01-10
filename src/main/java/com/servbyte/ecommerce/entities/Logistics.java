package com.servbyte.ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "logistics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Logistics extends AbstractEntity{
    private String companyName;
    private String logo;
    private String companyEmail;
    private String companyPhoneNumber;
}
