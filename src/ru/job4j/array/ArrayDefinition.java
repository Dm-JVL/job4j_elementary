package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];

        System.out.println("SHORT - " + ages.length);
        System.out.println("STRING - " + surname.length);
        System.out.println("PRICES - " + prices.length);

        String[] names = new String[4];
        names[0] = "Dmitriy";
        names[1] = "Ilya";
        names[2] = "Egor";
        names[3] = "Mariya";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
    }
}
