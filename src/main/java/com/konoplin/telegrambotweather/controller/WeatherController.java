package com.konoplin.telegrambotweather.controller;

import com.konoplin.telegrambotweather.model.Weather;
import com.konoplin.telegrambotweather.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    private WeatherService weatherService;
    private Weather weather;

    @GetMapping("/weather")
    public String showWeather(Weather weather) {
        weather = weatherService.getCurrentWeatherData("Moscow");
        return weather.toString();
    }

    public void setWeatherService(WeatherService weatherServiceMock) {
    }
}
