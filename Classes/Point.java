public class Point {

    private double x,y;

    public Point(){
        new Point();
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double callDistance(Point p){

        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));

    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

}
