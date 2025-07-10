package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    // Hands On 4 Implementation
    // Spring Core – Load Country from Spring Configuration XML 
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    // Getters and Setters for Country Code and Country Name
    public String getCode() {
        LOGGER.debug("Getting Country Code: {}", code);
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("Setting Country Code: {}", code);
        this.code = code;
    }

    public String getName() {
        LOGGER.debug("Getting Country Name: {}", name);
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Setting Country Name: {}", name);
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}