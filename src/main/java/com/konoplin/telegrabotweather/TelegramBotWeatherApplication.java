package com.konoplin.telegrabotweather;

import com.konoplin.telegrabotweather.model.Weather;
import com.konoplin.telegrabotweather.parser.Parser;
import com.konoplin.telegrabotweather.service.WeatherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class TelegramBotWeatherApplication implements Runnable {

    public static void main(String[] args) {
        new TelegramBotWeatherApplication().run();
        SpringApplication.run(TelegramBotWeatherApplication.class, args);
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                WeatherService weatherService = new WeatherService();
                Weather weather = weatherService.getCurrentWeatherData("Moscow");
                System.out.println(weather.getCity() + " " + weather.getTemperature() + " " + weather.getDescription());

            }
        }, 0,5000);

    }
}
