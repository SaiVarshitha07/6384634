package com.example.jwt_auth.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.security.Key;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

//Create authentication controller and configure it in SecurityConfig 
@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    private static final Key SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final long EXPIRATION_TIME = 86400000; // 1 day in ms

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("Start - /authenticate");

        String user = getUser(authHeader);
        LOGGER.debug("User extracted from authHeader: " + user);

        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("End - /authenticate");
        return map;
    }

    //Read Authorization header and decode the username and password 
    private String getUser(String authHeader) {
        LOGGER.debug("Authorization header: " + authHeader);

        String encodedCredentials = authHeader.substring("Basic ".length());
        LOGGER.debug("Encoded credentials: " + encodedCredentials);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedCredentials = new String(decodedBytes);
        LOGGER.debug("Decoded credentials: " + decodedCredentials);

        String username = decodedCredentials.split(":")[0];
        LOGGER.debug("Username extracted: " + username);

        return username;
    }

    //Generate token based on the user
    private String generateJwt(String user) {
        String token = Jwts.builder()
            .setSubject(user)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(SECRET_KEY)
            .compact();

        LOGGER.debug("Generated JWT Token: " + token);
        return token;
    }
}