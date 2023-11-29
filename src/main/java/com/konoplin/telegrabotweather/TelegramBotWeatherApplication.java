package com.konoplin.telegrabotweather;

import com.konoplin.telegrabotweather.parser.Parser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
                Parser parser = new Parser();
                String MoscowValue = parser.elementParserByURL("https://www.gismeteo.ru/weather-moscow-4368/",
                        "body > section.content.wrap > div.content-column.column1 > section.section.section-content.section-bottom-collapse > div > a:nth-child(1) > div > div.tab-content > div.weather > div.weather-value > span.unit.unit_temperature_c");
                String BronitsyValue = parser.elementParserByURL("https://www.gismeteo.ru/weather-bronnitsy-11392/",
                        "body > section.content.wrap > div.content-column.column1 > section.section.section-content.section-bottom-collapse > div > a:nth-child(1) > div > div.tab-content > div.weather > div.weather-value > span.unit.unit_temperature_c");

                System.out.println("Bronitsy = " + BronitsyValue);
                System.out.println("Moscow = " + MoscowValue);
            }
        }, 0,5000);

    }
}
