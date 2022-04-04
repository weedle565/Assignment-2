public class Circle {

    private Point centre;
    private double radius;

    public Circle(){
        centre = new Point(0, 0);
        radius = 0;
    }

    public Circle(Point p, double radius){
        centre = p;
        this.radius = radius;
    }

    public Point getCentre(){
        return centre;
    }

    public double getRadius(){
        return radius;
    }

    public double calArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
