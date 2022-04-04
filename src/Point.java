public class Point {

    private double x;
    private double y;

    //Default constructor to set the x and y values to 0
    public Point(){
        x = 0;
        y = 0;
    }

    //Create a new point at a given x and y value
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Return the points x value
    public double getX(){
        return x;
    }

    //Returns the points y value
    public double getY(){
        return y;
    }

    //Calculate the distance between a given point (p) and this point
    public double calDistance(Point p){

        return Math.sqrt(Math.pow(getX() - p.x, 2) + Math.pow(getY() - p.y, 2));

    }

}
