package com.konoplin.telegrambotweather;

import com.konoplin.telegrambotweather.controller.WeatherController;
import com.konoplin.telegrambotweather.model.Weather;
import com.konoplin.telegrambotweather.service.WeatherService;
import org.junit.*;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TelegraBotWeatherApplicationTests {

    @Test
    void contextLoads() {
    }
    /*
    @Test
    public void testShowWeather_Positive() {
        // Создаем заглушку для WeatherService
        WeatherService weatherServiceMock = Mockito.mock(WeatherService.class);

        // Создаем объект Weather для ожидаемого результата
        Weather expectedWeather = new Weather();
        expectedWeather.setCity("Moscow");
        expectedWeather.setTemperature(String.valueOf(25));

        // Устанавливаем поведение заглушки
        Mockito.when(weatherServiceMock.getCurrentWeatherData(Mockito.anyString())).thenReturn(expectedWeather);

        // Создаем объект WeatherController
        WeatherController weatherController = new WeatherController();
        weatherController.setWeatherService(weatherServiceMock);

        // Вызываем метод showWeather
        String result = weatherController.showWeather(new Weather());

        // Проверяем, что результат соответствует ожидаемому
        Assert.assertEquals(expectedWeather.toString(), result);
    }
    @Test
    public void testShowWeather_Negative() {
        // Создаем заглушку для WeatherService
        WeatherService weatherServiceMock = Mockito.mock(WeatherService.class);

        // Устанавливаем поведение заглушки
        Mockito.when(weatherServiceMock.getCurrentWeatherData(Mockito.anyString())).thenReturn(null);

        // Создаем объект WeatherController
        WeatherController weatherController = new WeatherController();
        weatherController.setWeatherService(weatherServiceMock);

        // Вызываем метод showWeather
        String result = weatherController.showWeather(new Weather());

        // Проверяем, что результат равен null
        Assert.assertNull(result);
    }

}
*/