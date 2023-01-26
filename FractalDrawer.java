// FractalDrawer class draws a fractal of a shape indicated by user input
// Written by Ketim Lamesssa, lames005


import java.awt.Color;
import java.util.Scanner;
import java.util.Random;

public class FractalDrawer {

    private static double totalArea = 0;  // member variable for tracking the total area

    public FractalDrawer() {}

    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas defaultCanvas = new Canvas(1200, 1200);
        Color c = new Color(52, 107, 35);
        if (type.equals("circle")) {
            this.drawCircleFractal(100, 500, 500, c, defaultCanvas, 7);
        } else if (type.equals("triangle")) {
            this.drawTriangleFractal(300.0, 210.0, 500, 500, c, defaultCanvas, 7);
        } else if (type.equals("rectangle")) {
            this.drawRectangleFractal(300, 210, 500, 500, c, defaultCanvas, 7);
        }
        return this.totalArea;    //returns total area of specified shape
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas defaultCanvas, int level) {
        if (level == 0) {
            return ;
        }
        Triangle myTriangle = new Triangle(x, y, width, height); //Creating the new base triangle
        myTriangle.setColor(c);
        defaultCanvas.drawShape(myTriangle);
        totalArea += myTriangle.calculateArea();
        Color cArray[] = {Color.BLACK, Color.DARK_GRAY,Color.BLUE, Color.YELLOW,Color.RED, Color.ORANGE,Color.GREEN, Color.BLACK};
        c = cArray[level];
        if (level != 0) {
            drawTriangleFractal(width / 2, height / 2, x + width, y, c, defaultCanvas, level -1);
            drawTriangleFractal(width / 2, height / 2, x - (width / 2.0),y, c, defaultCanvas , level -1);
            drawTriangleFractal(width / 2, height / 2, x + (width / 4.0), y - height, c, defaultCanvas, level -1);
        }
    }



    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas defaultCanvas, int level) {
        if (level == 0) {
            return ;
        }
        Circle myCircle = new Circle(x, y, radius);
        myCircle.setColor(c);
        defaultCanvas.drawShape(myCircle);
        totalArea += myCircle.calculateArea();

        Color cArray[] = {Color.BLACK, Color.DARK_GRAY,Color.BLUE, Color.YELLOW,Color.RED, Color.ORANGE,Color.GREEN, Color.BLACK};
        c = cArray[level];

        if (level != 0) {
            drawCircleFractal(radius / 2, x + radius, y- radius, c, defaultCanvas, level -1);
            drawCircleFractal(radius / 2, x - radius, y + radius, c, defaultCanvas, level -1);
            drawCircleFractal(radius / 2, x + radius, y + radius ,c ,  defaultCanvas, level-1);
            drawCircleFractal(radius / 2, x - radius, y - radius ,c, defaultCanvas, level -1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas defaultCanvas, int level) {
        if (level == 0) {
            return ;
        }
        Rectangle myRectangle = new Rectangle(x, y, width, height);
        myRectangle.setColor(c);
        defaultCanvas.drawShape(myRectangle);

        totalArea += myRectangle.calculateArea();
        Color cArray[] = {Color.BLACK, Color.DARK_GRAY,Color.BLUE, Color.YELLOW,Color.RED, Color.ORANGE,Color.GREEN, Color.BLACK};
        c = cArray[level];
        if (level != 0) {
            drawRectangleFractal(width / 2, height / 2, x + width, y - (height/2), c,  defaultCanvas, level -1);
            drawRectangleFractal(width / 2, height / 2, x + width , y + height, c, defaultCanvas, level -1);
            drawRectangleFractal(width / 2, height / 2, x - (width/2) , y + height, c, defaultCanvas, level -1);
            drawRectangleFractal(width / 2, height / 2, x - (width/2) , y - (height/2), c, defaultCanvas, level -1);
        }
    }
        // TODO:
        //  main should ask user for shape input, and then draw the corresponding fractal.
        //  should print area of fractal
        public static void main (String[]args){
            FractalDrawer drawer = new FractalDrawer();
            System.out.println("Enter Shape: ");         //prompts user to enter desired shape
            Scanner myScanner = new Scanner(System.in);
            String shape = myScanner.nextLine();
            System.out.println(drawer.drawFractal(shape));
        }

}
