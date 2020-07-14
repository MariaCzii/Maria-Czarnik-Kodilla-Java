package com.kodilla.testing.shape;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeTests() {
        System.out.println("Start of all tests");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("End of all tests");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void  testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4.4,6.0, 5.5);
        //when
        shapeCollector.addFigure(triangle);
        //Then
        assertEquals(1, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4.4,6.0, 5.5);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4.4,6.0, 5.5);
        shapeCollector.addFigure(triangle);
        //When
        Shape getShape = shapeCollector.getFigure(0);
        //Then
        assertEquals(triangle, getShape);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(4.4,6.0, 5.5);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.showFigures();

        //Then test pass
    }

}
