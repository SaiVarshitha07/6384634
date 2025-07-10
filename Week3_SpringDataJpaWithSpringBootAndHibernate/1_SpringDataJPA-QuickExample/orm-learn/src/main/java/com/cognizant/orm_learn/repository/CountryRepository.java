package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.orm_learn.model.Country;

// Hands On 1 Implementation
// Spring Data JPA - Quick Example 
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}