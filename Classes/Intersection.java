public class Intersection {

    private Circle circleA;
    private Circle circleB;

    public Intersection(){
        circleA = new Circle();
        circleB = new Circle();
    }

    public Intersection(Circle circleA, Circle circleB){
        this.circleA = circleA;
        this.circleB = circleB;
    }

    public Circle getCircleA() {
        return circleA;
    }

    public Circle getCircleB() {
        return circleB;
    }

    public double callIntersectionArea() {

        Point circleACentre = circleA.getCentre();
        Point circleBCentre = circleB.getCentre();

        double distance = circleACentre.callDistance(circleBCentre);

        double distance1 = (Math.pow(circleA.getRadius(), 2) - Math.pow(circleB.getRadius(), 2) + Math.pow(distance, 2)) / 2 * distance;
        double distance2 = distance - distance1;

        if (distance >= circleA.getRadius() + circleB.getRadius()) {
            return 0;
        } else if (distance + getCircleB().getRadius() <= getCircleA().getRadius()) {
            return circleB.calArea();
        } else {

            return circleA.getRadius() * Math.acos(distance1 / circleA.getRadius()) - (distance1 * Math.sqrt(Math.pow(circleA.getRadius(), 2) - Math.pow(distance1, 2)))
                    + Math.pow(circleB.getRadius(), 2) * Math.acos(distance2 / circleB.getRadius()) - (distance2 * Math.sqrt(Math.pow(circleB.getRadius(), 2) - Math.pow(distance2, 2)));

        }
    }
}
