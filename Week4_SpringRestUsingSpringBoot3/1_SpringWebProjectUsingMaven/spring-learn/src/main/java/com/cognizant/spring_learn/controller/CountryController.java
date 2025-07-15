package com.cognizant.spring_learn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;

// Hands On 2: REST Country Web Service
// Refer 2_RestCountryWebService Folder for the Output
@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("Start - getCountryIndia()");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country india = (Country) context.getBean("country");

        LOGGER.debug("Country Code: {}", india.getCode());
        LOGGER.debug("Country Name: {}", india.getName());
        
        LOGGER.info("End - getCountryIndia()");
        return india;
    }

    // Hands On 5: REST - Get Country based on country code
    // Refer 5_GetCountryBasedOnCountryCode Folder for the Output
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("Start - getCountry() with code: {}", code);

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        Country result = countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Country not found with code: " + code));

        LOGGER.debug("Country Code: {}", result.getCode());
        LOGGER.debug("Country Name: {}", result.getName());

        LOGGER.info("End - getCountry()");
        return result;
    }
}