package com.konoplin.telegrambotweather.repository;

import com.konoplin.telegrambotweather.model.Weather;

import java.util.List;

interface WeatherDTO {

    void save(Weather weather);

    List<Weather> getAll();

}