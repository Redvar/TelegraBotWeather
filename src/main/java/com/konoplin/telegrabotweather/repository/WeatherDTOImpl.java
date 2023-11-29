package com.konoplin.telegrabotweather.repository;

public class WeatherDTOImpl implements WeatherDTO {
    private String city;
    private double temperature;
    private String description;

    public WeatherDTOImpl(String city, double temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

