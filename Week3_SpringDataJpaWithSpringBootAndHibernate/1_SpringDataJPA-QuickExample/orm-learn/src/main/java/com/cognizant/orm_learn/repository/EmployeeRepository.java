package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.orm_learn.model.Employee;

// Hands On 4 Implementation
// Difference between JPA, Hibernate and Spring Data JPA 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}