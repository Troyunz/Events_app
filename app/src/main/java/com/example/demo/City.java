package com.example.demo;

public class City {
    static int image;
    static String text;

    public static int getImage() {
        return image;
    }

    public static String getText() {
        return text;
    }

    public City(int image, String text) {
        City.image = image;
        City.text = text;
    }
}
