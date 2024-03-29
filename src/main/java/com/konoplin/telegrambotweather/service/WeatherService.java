package com.konoplin.telegrambotweather.service;

import com.konoplin.telegrambotweather.model.Weather;
import com.konoplin.telegrambotweather.parser.Parser;

public class WeatherService {

    public Weather getCurrentWeatherData(String city) {
        Parser parser = new Parser();
        String description = parser.elementParserByURL("https://www.gismeteo.ru/weather-moscow-4368/",
                "body > section.content.wrap > div.content-column.column1 > section.section.section-content.section-bottom-collapse > div > a:nth-child(1) > div > div.tab-content > div.weather > div.weather-value > span.unit.unit_temperature_c");
        String temperature = description;
        return new Weather(city, temperature, description);
    }
}