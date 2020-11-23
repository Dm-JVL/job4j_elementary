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
        int expectedEuro = 6;
        int expectedDollar = 7;
        int value = 420;
        int euro = Converter.rubleToEuro(value);
        boolean resultEuro = euro == expectedEuro;
        int dollar = Converter.rubleToDollar(value);
        boolean resultDollar = dollar == expectedDollar;
        System.out.println(value + " rubles are " + euro + " euro. Test result is " + resultEuro);
        System.out.println(value + " rubles are " + dollar + " dollar. Test result is " + resultDollar);

    }
}

