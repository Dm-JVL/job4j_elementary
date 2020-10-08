package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        System.out.println("\nЗадача для п. 6.0.3. Массивы и цикл for. [#373992]:");
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            number[i] = i * 2 + 3;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
        System.out.println("\nЗадача для п. 6.0.3.1. Массивы и цикл for-earch [#374001]:");
        for (int num: number) {
            System.out.println(num);
        }
    }
}

