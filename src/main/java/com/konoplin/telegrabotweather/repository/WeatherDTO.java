package com.konoplin.telegrabotweather.repository;

interface WeatherDTO {
    String getCity();

    double getTemperature();

    String getDescription();
}