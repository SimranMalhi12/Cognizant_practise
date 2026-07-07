package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);



    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("Start");

        LOGGER.debug("Authorization Header : {}", authHeader);

        String user = getUser(authHeader);

        LOGGER.debug("Logged in User : {}", user);

        Map<String, String> map = new HashMap<>();

        String token = generateJwt(user);

        map.put("token", token);

        LOGGER.info("End");

        return map;
    }
    private String getUser(String authHeader) {

        LOGGER.info("Start");

        // Remove "Basic "
        String encodedCredentials = authHeader.substring(6);

        LOGGER.debug("Encoded Credentials: {}", encodedCredentials);

        // Decode Base64
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);

        String credentials = new String(decodedBytes);

        LOGGER.debug("Decoded Credentials: {}", credentials);

        // Extract username
        String user = credentials.substring(0, credentials.indexOf(":"));

        LOGGER.debug("User: {}", user);

        LOGGER.info("End");

        return user;
    }

    private String generateJwt(String user) {

        LOGGER.info("Start");

        JwtBuilder builder = Jwts.builder();

        builder.setSubject(user);

        // Token issue time
        builder.setIssuedAt(new Date());

        // Token expiry after 20 minutes
        builder.setExpiration(new Date(System.currentTimeMillis() + 1200000));

        // Secret key
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");

        String token = builder.compact();

        LOGGER.debug("Generated Token : {}", token);

        LOGGER.info("End");

        return token;
    }
}