package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.orm_learn.model.Employee;

// Hands On 2: Difference between JPA, Hibernate and Spring Data JPA 
// Refer 2_DifferenceBetweenJpaHibernateAndSpringDataJPA Folder for the Output
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}