package shapemaker;

import TurtleGraphics.*;

public class Wheel extends Circle{
    
    public int spokes;
    
    public Wheel(){
        super();
        spokes=0;
    }
    
    public Wheel(double xloc, double yloc, double r, int s){
        super(xloc,yloc,r);
        spokes=s;
    }
    public void draw(Pen p){
        super.draw(p);
        for(int x=0; x<=spokes; x++){
            p.up();
            p.move(xPos,yPos);
            p.setDirection(x*360/spokes);
            p.down();
            p.move(radius);
        }
    }
    public void setSpokes(int s){
        spokes=s;
    }
    
     public String toString(){
        String str="This is a WHEEL\n";
        str += "XLOC: " + xPos + "\tYLOC: " + yPos + "\n";
        str += "RADIUS: " + radius + "\n";
        str += "AREA: " + area();
        return str;
    }
        
}