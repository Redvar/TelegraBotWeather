package com.konoplin.telegrambotweather.model;

import java.io.Serializable;

public class Weather implements Serializable {
    private String city;
    private String temperature;
    private String description;

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", description='" + description + '\'' +
                '}';
    }

    public Weather(String city, String temperature, String description){
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
