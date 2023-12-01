package com.konoplin.telegrabotweather.controller;

import com.konoplin.telegrabotweather.model.Weather;
import com.konoplin.telegrabotweather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String showWeather(Weather weather) {
        String weatherData = weatherService.getCurrentWeatherData("Moscow");
        model.addAttribute("weatherData", weatherData);
        return "weather";
    }
}
