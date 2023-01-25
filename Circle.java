// Written by Ketim Lamesssa, lames005

import java.lang.Math;
import java.awt.Color;

public class Circle {
    private double xCoordinate;
    private double yCoordinate;
    private double radius;
    public Color color;

    public Circle(double xCoordinate, double yCoordinate, double radius) {
       this.xCoordinate = xCoordinate;
       this.yCoordinate = yCoordinate;
       this.radius = radius;
    }
    public double calculatePerimeter() {
        return ((radius * 2) * Math.PI);
    }
    public double calculateArea() {
        return ((radius * radius) * Math.PI);
    }
    public void setColor(Color color) {
      this.color = color;
    }
    public void setPos(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Color getColor() {
        return color;
    }
    public double getXPos() {
        return xCoordinate;
    }
    public double getYPos() {
        return yCoordinate;
    }
    public double getRadius() {
        return radius;
    }
}
