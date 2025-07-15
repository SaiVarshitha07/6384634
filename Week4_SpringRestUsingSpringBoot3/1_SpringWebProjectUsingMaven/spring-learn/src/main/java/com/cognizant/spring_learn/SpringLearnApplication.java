package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
    
    // Hands On 1: Create a Spring Web Project using Maven 
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Starting SpringLearnApplication...");
        SpringApplication.run(SpringLearnApplication.class, args);
        LOGGER.info("SpringLearnApplication started successfully!");
        
        displayCountry();
    }

    // Hands On 2: Spring Core – Load Country from Spring Configuration XML
    // Refer 2_LoadCountryFromSpringConfigXml Folder for the Output
    public static void displayCountry() {
        LOGGER.debug("Start - displayCountry()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country", Country.class);
        LOGGER.debug("Country Code: {}", country.getCode());
        LOGGER.debug("Country Name: {}", country.getName());
        LOGGER.debug("Country: {}", country.toString());
        LOGGER.debug("End - displayCountry()");
    }
}