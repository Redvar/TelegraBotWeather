package com.konoplin.telegrabotweather.service;

import com.konoplin.telegrabotweather.model.Weather;
import com.konoplin.telegrabotweather.parser.Parser;

public class WeatherService {

    public Weather getCurrentWeatherData(String city) {
        Parser parser = new Parser();
        Double temperature = Double.parseDouble(parser.elementParserByURL("https://www.gismeteo.ru/weather-moscow-4368/",
                "body > section.content.wrap > div.content-column.column1 > section.section.section-content.section-bottom-collapse > div > a:nth-child(1) > div > div.tab-content > div.weather > div.weather-value > span.unit.unit_temperature_c"));
        String description = parser.elementParserByURL("https://www.gismeteo.ru/weather-moscow-4368/",
                "body > section > div.content-column.column1 > section:nth-child(1) > div.current-weather > div > div.frames > div.frame-now > div.weather-info-header > div.weather-description");
        Weather curentWeather = new Weather(city, temperature, description);
        return curentWeather;
    }
}
      //body > section > div.content-column.column1 > section:nth-child(1) > div.current-weather > div > div.frames > div.frame-now > div.weather-info-header > div.weather-description