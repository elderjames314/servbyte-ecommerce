package com.servbyte.ecommerce.repository;

import com.servbyte.ecommerce.entities.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends JpaRepository<Cities, Long> {

}
