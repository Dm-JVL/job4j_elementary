package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int ost = money - price;
        for (int indexCoin = 0; indexCoin < COINS.length; indexCoin++) {
            while (ost >= COINS[indexCoin]) {
                ost -= COINS[indexCoin];
                rsl[size] = COINS[indexCoin];
                size++;
           }
        }
        return Arrays.copyOf(rsl, size);
    }
}