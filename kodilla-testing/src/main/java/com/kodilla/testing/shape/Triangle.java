package com.kodilla.testing.shape;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Triangle implements Shape{
    private final static String NAME = "Triangle";
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Values are not correct");
        }

        double[] sides = {a, b, c};
        Arrays.sort(sides);
        this.a = sides[0];
        this.b = sides[1];
        this.c = sides[2];
    }
    @Override
    public String getShapeName(){
        return NAME;
    }

    @Override
    public double getField() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle(" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ')';
    }
}
