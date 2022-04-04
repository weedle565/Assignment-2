public class Intersection {

    private Circle circleA;
    private Circle circleB;

    //Default constructor to assign values to the globals to avoid NullPointerExceptions
    public Intersection(){
        circleA = new Circle();
        circleB = new Circle();
    }

    /**
     * Saves the circles being used for intersection into the globals to calculate the intersection area
     * @param circleA The first circle to test for intersection
     * @param circleB The second circle to test for intersection
     */
    public Intersection(Circle circleA, Circle circleB){
        this.circleA = circleA;
        this.circleB = circleB;
    }

    //Returns the first circle (circleA)
    public Circle getCircleA() {
        return circleA;
    }

    //Returns the second circle (circleB)
    public Circle getCircleB() {
        return circleB;
    }

    //Calculates the area of the intersection
    public double calIntersectionArea() {

        //Create new local points at the circles centres
        Point circleACentre = circleA.getCentre();
        Point circleBCentre = circleB.getCentre();

        //Find the distance between the 2 circles centres
        double distance = circleACentre.calDistance(circleBCentre);

        //Calculate the distance between circle one's centre and the middle of the intersection area
        double distance1 = (Math.pow(circleA.getRadius(), 2) - Math.pow(circleB.getRadius(), 2) + Math.pow(distance, 2)) / 2 * distance;
        //Calculate the distance between circle twos centre and the middle of the intersection area
        double distance2 = distance - distance1;

        //if the distance is greater than or equal to circle As radius + circle Bs radius the intersection only occurs up to a point therefore the area is 0
        if (distance >= circleA.getRadius() + circleB.getRadius()) {
            return 0;
        } else if (distance + getCircleB().getRadius() <= getCircleA().getRadius()) {
            /*
            If distance + circle Bs radius is smaller than or equal to circle A's radius
            then circle A is entirely contained in circle A thus the intersection area is circle Bs area
             */
            return circleB.calArea();
        } else {
            //Finally, if neither of the previous conditions are false, calculate using the general intersection formula
            return circleA.getRadius() * Math.acos(distance1 / circleA.getRadius()) - (distance1 * Math.sqrt(Math.pow(circleA.getRadius(), 2) - Math.pow(distance1, 2)))
                    + Math.pow(circleB.getRadius(), 2) * Math.acos(distance2 / circleB.getRadius()) - (distance2 * Math.sqrt(Math.pow(circleB.getRadius(), 2) - Math.pow(distance2, 2)));
        }
    }
}
