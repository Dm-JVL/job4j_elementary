package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To4Then1() {
        int result = Max.max(4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void when3Max2To4Then4() {
        int result = Max.max(4, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void when4Max1To4Then4() {
        int result = Max.max(1, 3, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void when4MaxTo0Then4() {
        int result = Max.max(0, 0, 0, -1);
        assertThat(result, is(0));
    }
}