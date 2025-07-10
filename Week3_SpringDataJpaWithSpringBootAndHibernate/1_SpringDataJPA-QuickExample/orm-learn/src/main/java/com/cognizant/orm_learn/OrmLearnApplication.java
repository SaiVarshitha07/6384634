package com.cognizant.orm_learn;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;

@SpringBootApplication
public class OrmLearnApplication {
    // Hands On 1 Implementation
    // Spring Data JPA - Quick Example
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    // Hands On 4 Implementation
    // Difference between JPA, Hibernate and Spring Data JPA 
    private static EmployeeService employeeService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main");

        // Hands On 1 Implementation
        // Spring Data JPA - Quick Example
        countryService = context.getBean(CountryService.class);
        testGetAllCountries();

        // Hands On 4 Implementation
        // Difference between JPA, Hibernate and Spring Data JPA
        employeeService=context.getBean(EmployeeService.class);
        testAddEmployee();
    }

    // Hands On 1 Implementation
    // Spring Data JPA - Quick Example
    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }

    // Hands On 4 Implementation
    // Difference between JPA, Hibernate and Spring Data JPA
    private static void testAddEmployee() {
        LOGGER.info("Start");
        Employee employee = new Employee();
        employee.setName("ABC");
        employee.setSalary(55000.0);
        employeeService.addEmployee(employee);
        LOGGER.debug("Added employee = {}", employee);
        LOGGER.info("End");
    }
}