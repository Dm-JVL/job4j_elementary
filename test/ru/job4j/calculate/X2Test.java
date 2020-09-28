package ru.job4j.calculate;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    public void whenA10B9C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);

        //Модификации
        //1 строка:
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        expected = 3;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);

        //2 строка:
        a = 0;
        b = 1;
        c = 1;
        x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);

        //3 строка:
        a = 1;
        b = 1;
        c = 0;
        x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);

        //4 строка:
        a = 1;
        b = 1;
        c = 1;
        x = 0;
        expected = 1;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}