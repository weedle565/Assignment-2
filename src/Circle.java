/*------------------------------------------------------
Name: Oliver Ross
Student number: 7458939
Email address: or955@uowmail.edu.au
Subject Code: CSIT111
Assignment number: 2
-------------------------------------------------------*/
public class Circle {

    private Point centre;
    private double radius;

    public Circle(){
        centre = new Point();
        radius = 0;
    }

    //Create a new circle at a specified centre (p) and radius (radius)
    public Circle(Point p, double radius){
        centre = p;
        this.radius = radius;
    }

    //Returns the circles centre as a point
    public Point getCentre(){
        return centre;
    }

    //Returns the circles radius
    public double getRadius(){
        return radius;
    }

    //Returns the area of the circle using the formula pi * radius^2
    public double calArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
