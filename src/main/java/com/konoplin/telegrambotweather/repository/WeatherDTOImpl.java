package com.konoplin.telegrambotweather.repository;

import com.konoplin.telegrambotweather.model.Weather;

import java.util.List;

public class WeatherDTOImpl implements WeatherDTO {
    private final String city;
    private final String temperature;
    private final String description;

    public WeatherDTOImpl(String city, String temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    @Override
    public void save(Weather weather) {
        //
    }

    @Override
    public List<Weather> getAll() {
        //
        //
        //
        return null;
    }
}