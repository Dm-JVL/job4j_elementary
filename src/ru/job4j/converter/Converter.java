package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int value = 420;
        int euro = Converter.rubleToEuro(value);
        int dollar = Converter.rubleToDollar(value);
        System.out.println(value+" rubles are " + euro + " euro.");
        System.out.println(value+" rubles are " + dollar + " dollar.");

    }
}