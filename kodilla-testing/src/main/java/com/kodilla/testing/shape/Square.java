package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private final static String NAME = "Square";
    private double a;

    public Square(double a){
        if(a <=0){
            throw new IllegalArgumentException("wrong length");
        }
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return a * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public String toString() {
        return "Square(" +
                "a=" + a +
                ')';
    }
}
