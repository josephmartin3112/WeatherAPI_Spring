package com.ust.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";

    @Autowired
    private RestTemplate restTemplate;

    // Your OpenWeatherMap API key
    private final String apiKey = "38bf8dded88060a02fae3ca0126247d3";  // Your provided API key

    public String getWeatherByCity(String city) {
        // Make an API call to OpenWeatherMap and fetch the weather information
        return restTemplate.getForObject(API_URL, String.class, city, apiKey);
    }
}
