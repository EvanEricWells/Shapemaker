package shapemaker;

import TurtleGraphics.*;

/**
 *
 * @author evan5090
 */

public class Triangle implements Shape {

    private double xPos, yPos, height, base, x1, x2, x3, y1, y2, y3;
    
    public Triangle(){
        xPos=0;
        yPos=0;
        height=1;
        base=1;
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
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(base);
        p.setDirection(-45);
        p.move(xPos+base/2, yPos+height);
        p.setDirection(-45);
        p.move(xPos, yPos);
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
        height*=factor;
        base*=factor;
                
    }
    
    public String toString(){
        String str="This is a TRIANGLE\n";
        str += "XLOC: " + xPos + "\tYLOC: " + yPos + "\n";
        str += "BASE: " + base + "\tHEIGHT: " + height + "\n";
        str += "AREA: " + area();
        return str;
    }
    
}
