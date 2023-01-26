// Written by Ketim Lamesssa, lames005

import java.lang.Math;
import java.awt.Color;

public class Rectangle {

    private double xCoordinateL;
    private double yCoordinateR;
    private double width;
    private double height;
    public Color color;

    public Rectangle(double xCoordinateL, double yCoordinateR,double width, double height) {
        this.xCoordinateL = xCoordinateL;
        this.yCoordinateR = yCoordinateR;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return (height * 2) + (width * 2);
    }

    public double calculateArea() {
        return (width * height);
    }

    public double getArea() {
        return height * width;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPos(double xCoordinateL,double yCoordinateR) {
        this.xCoordinateL = xCoordinateL;
        this.yCoordinateR = yCoordinateR;
    }

    public void setHeight(double height) {
       this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return xCoordinateL;
    }
    public double getYPos() {
        return yCoordinateR;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

}





