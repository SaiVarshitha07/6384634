package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Hands On 1 Implementation
// Spring Data JPA - Quick Example 
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code")
    private String code;

    @Column(name = "co_name")
    private String name;

    // Getters and Setters for the Country Code and Country Name
    public String getCode() {
    	return code; 
    }
    public void setCode(String code) { 
    	this.code = code; 
    }

    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}