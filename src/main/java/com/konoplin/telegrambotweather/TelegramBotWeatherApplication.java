package com.konoplin.telegrambotweather;

import com.konoplin.telegrambotweather.controller.WeatherController;
import com.konoplin.telegrambotweather.exception.ApiVersionException;

public class TelegramBotWeatherApplication implements Runnable {

    public static void main(String[] args) {
        TelegramBotWeatherApplication telegramBotWeatherApplication = new TelegramBotWeatherApplication();
        telegramBotWeatherApplication.run();
        try {
            WeatherController weatherController = new WeatherController("https://api.openweathermap.org/data",
                    "7e50dc602ed60da158046408d90d67e6", "3.0",
                    "onecall", 55.42, 38.26);
            String weather = weatherController.getCurrentWeatherData();
            System.out.println(weather);
        } catch (ApiVersionException e) {
            System.out.println("Не совпадение версий Api");
            System.exit(0);
        }
    }

    @Override
    public void run() {

    }
}
        //TEST

   /*
   @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        }, 0, 5000);
    }
    */
