package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> list = new ArrayList<>();

    public ShapeCollector() {

    }

    public void addFigure(Shape shape) {

    }

    public boolean removeFigure(Shape shape) {
        return true;
    }

    public Shape getFigure(int n) {
        return null;
    }

    public int getShapeQuantity(){
        // return 100 temporarily
        return 100;
    }

    public void showFigures() {
        for (Shape shape : list) {
            System.out.println(shape);
        }
    }
}
