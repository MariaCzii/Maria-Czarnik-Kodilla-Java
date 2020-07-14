package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private final static String NAME = "Circle";
    private double radius;

    public Circle(double radius){
        if(radius<=0){
            throw new IllegalArgumentException("wrong radius");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return Math.PI * radius * radius;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle(" +
                "radius=" + radius +
                ")";
    }
}
