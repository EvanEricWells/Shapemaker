package shapemaker;

import TurtleGraphics.*;

/**
 *
 * @author evan5090
 */

public class Triangle implements Shape {

    private double xPos, yPos, height, base;
    
    public Triangle(){
        xPos=0;
        yPos=0;
        height=0;
        base=0;
    }
    
    public Triangle(double x, double y, double h, double b){
        xPos=x;
        yPos=0;
        height=h;
        base=b;
    }
    
    public double area() {
        return (height*base)/2;
    }

    public void draw(Pen p) {
        
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public void move(double xLoc, double yLoc) {
        xPos=xLoc;
        yPos=yLoc;
    }

    public void stretchBy(double factor) {
        
                
    }
    
}
