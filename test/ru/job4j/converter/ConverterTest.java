package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert420RblThen6Euro() {
        int in = 420;
        int expected = 6;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert420RblThen7Dollar() {
        int in = 420;
        int expected = 7;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

}