package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when00to10then1() {
        int expected = 1;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when00to01then1() {
        int expected = 1;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when00to01then3() {
        int expected = 3;
        int x1 = 1;
        int y1 = 0;
        int x2 = 4;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 3);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(5, 0.001));
    }

    @Test
    public void distanceNew() {
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        double rsl = a.distanceNew(b);
        assertThat(rsl, closeTo(3, 0.001));
    }
}