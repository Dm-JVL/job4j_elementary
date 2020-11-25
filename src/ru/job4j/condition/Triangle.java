package ru.job4j.condition;


import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac));
    }

    public double area() {
        double rsl = -1;
        double ab = first.distanceNew(second);
        double ac = first.distanceNew(third);
        double bc = second.distanceNew(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }


}
