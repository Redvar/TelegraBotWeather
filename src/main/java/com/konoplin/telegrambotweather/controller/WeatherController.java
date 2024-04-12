package com.konoplin.telegrambotweather.controller;

import com.konoplin.telegrambotweather.exception.ApiVersionException;
import com.konoplin.telegrambotweather.model.Weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class WeatherController {
    private String apiUrl;
    private Weather currentWeatherData;


    public String getCurrentWeatherData(){
        StringBuilder respons = new StringBuilder();
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection)  url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null){
                respons.append(line);
            }
            reader.close();
            connection.disconnect();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return respons.toString();
    }

    public WeatherController(String url, String token,
                             String version, String typeCall,
                             double lon, double lat) throws ApiVersionException {
        if (version.compareTo("3.0") == 1) {
            throw new ApiVersionException();
        }
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(url)
                .append("/" + version)
                .append("/" + typeCall)
                .append("?lat=" + lat)
                .append("&lon=" + lon)
                .append("&appid=" + token);
        this.apiUrl = urlBuilder.toString();
        System.out.println("Конструктор контроллера прошел инициализацию. \n" +
                "Получаный url: \n" +
                apiUrl);
    }

    public String getApiUrl() {
        return apiUrl;
    }
}
