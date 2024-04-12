package com.konoplin.telegrambotweather.model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Weather {
    private String city;
    private Date time;
    private String temperature;
    private double lon;
    private double lat;

    public Weather(String city, Date time, String temperature, double lon, double lat) {
        this.city = city;
        this.time = time;
        this.temperature = temperature;
        this.lon = lon;
        this.lat = lat;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
