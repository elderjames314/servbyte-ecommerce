package com.servbyte.ecommerce.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Roles extends AbstractEntity {
   private String name;
   private String description;

   public Roles() {
   }

   public Roles(String name, String description) {
      this.name = name;
      this.description = description;
   }
}
