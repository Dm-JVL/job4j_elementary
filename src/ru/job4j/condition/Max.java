package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left <= right ? right : left;
        return result;
    }

    public static int max(int first, int second, int third) {
        return (max(max(first, second), third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return (max(max(max(first, second), third), fourth));
    }

    public static void main(String[] args) {
        System.out.println("Максимум 1 и 2 = " + Max.max(1, 2));
        System.out.println("Максимум 4 и 1 = " + Max.max(4, 1));
        System.out.println("Максимум 4 и 4 = " + Max.max(4, 4));
    }
}

