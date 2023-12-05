package com.konoplin.telegrambotweather;

import com.konoplin.telegrambotweather.controller.WeatherController;
import com.konoplin.telegrambotweather.model.Weather;
import com.konoplin.telegrambotweather.service.WeatherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class TelegramBotWeatherApplication implements Runnable {

    WeatherController weatherController = new WeatherController();

    public static void main(String[] args) {
        SpringApplication.run(TelegramBotWeatherApplication.class, args);
        new TelegramBotWeatherApplication().run();

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
        }, 0, 5000);
    }
}
