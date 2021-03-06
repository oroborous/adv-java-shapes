package edu.wctc.openclosedshapes.after.shapes;

import edu.wctc.openclosedshapes.after.Shape;
import edu.wctc.openclosedshapes.ShapeType;

import java.awt.*;

public class Square extends Shape {
    private double sideLength;
    private Point topLeft;

    public Square() {
        type = ShapeType.SQUARE;
    }

    public void draw() {
        // Imagine code to draw a square
        System.out.println("Square drawn");
    }
}
