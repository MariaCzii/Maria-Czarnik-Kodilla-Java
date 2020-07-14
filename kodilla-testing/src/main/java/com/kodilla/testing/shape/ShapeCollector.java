package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> list = new ArrayList<>();

    public ShapeCollector() {

    }

    public void addFigure(Shape shape) {
    list.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return list.remove(shape);
    }

    public Shape getFigure(int n) {
        return list.get(n);
    }

    public int getShapeQuantity(){
        return list.size();
    }

    public void showFigures() {
        for (Shape shape : list) {
            System.out.println(shape);
        }
    }
}
