// Written by Ketim Lamesssa, lames005

import java.lang.Math;
import java.awt.Color;

public class Triangle {
    private double xCoordinateL;
    private double yCoordinateR;
    private double width;
    private double height;
    public Color color;

    public Triangle(double xCoordinateL, double yCoordinateR, double width, double height) {
        this.xCoordinateL = xCoordinateL;
        this.yCoordinateR = yCoordinateR;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return Math.sqrt((Math.pow(width/2, 2)) + Math.pow(height, 2)) + Math.sqrt((Math.pow(width/2, 2)) + Math.pow(height, 2)) + width;
    }
    public double calculateArea() {
        return (width * height)/2 ;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPos(double xCoordinateL, double yCoordinateR) {
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











