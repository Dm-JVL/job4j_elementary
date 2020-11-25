package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceNew(Point that) {
        return sqrt((pow(that.x - this.x, 2) + pow(that.y - this.y, 2)));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt((pow(x2 - x1, 2) + pow(y2 - y1, 2)));
        return rsl;
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public double distance3d(Point that) {
        return sqrt((pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2)));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 3);
        double dist = a.distanceNew(b);
        System.out.println(dist);
    }
}