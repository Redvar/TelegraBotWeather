package com.konoplin.telegrabotweather.parser;

import jakarta.annotation.Nullable;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
//Класс который будет использовать данный метод вынужден использовать проверку на нуль
public class Parser {
    Document doc;

    @Nullable
    public String elementParserByURL(String targetPageURL, String targetByCSSSelector) {
        try {
            doc = Jsoup.connect(targetPageURL).get();
            Elements elements = doc.select(targetByCSSSelector);
            if (elements.size() > 0) {
                Element element = elements.get(0);
                return element.text();
            } else {

                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}