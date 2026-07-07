package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries = new ArrayList<>();

        countries.add(context.getBean("countryIndia", Country.class));
        countries.add(context.getBean("countryUS", Country.class));
        countries.add(context.getBean("countryGermany", Country.class));
        countries.add(context.getBean("countryJapan", Country.class));

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }
}