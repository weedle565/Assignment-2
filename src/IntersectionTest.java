import java.util.Scanner;

public class IntersectionTest {

    private static Intersection intersection;

    public static void main(String[] args){
        System.out.println("\n*** Intersection Area Calculation *** \n");
        prompt();
        displayCircleAreas();
        displayIntersectionArea();
    }

    private static void prompt(){
        System.out.println("Enter the Coordinate of centre point (x, y) and radius for the first circle");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //Separate the 3 values into an array and split them between the spaces creating a string array: {x, y, radius}
        String[] separator1 = input.split(" ");

        //Create a new point at the specified values where separator1[0] is x, separator1[1] is y and separator1[2] is radius
        Point centre1 = new Point(Double.parseDouble(separator1[0]), Double.parseDouble(separator1[1]));
        double radiusC1 = Double.parseDouble(separator1[2]);

        //Create a new circle with centre point at centre1 and radius of radius1
        Circle circle1 = new Circle(centre1, radiusC1);

        System.out.println("Enter the Coordinate of centre point (x, y) and radius for the second circle");
        input = scanner.nextLine();

        //Split the second input into a new array, see above for array format
        String[] separator2 = input.split(" ");

        //Create a new point at the specified values where separator2[0] is x, separator2[1] is y and separator2[2] is radius
        Point centre2 = new Point(Double.parseDouble(separator2[0]), Double.parseDouble(separator2[1]));
        double radiusC2 = Double.parseDouble(separator2[2]);

        //Create a new circle with centre point at centre2 and radius of radius2
        Circle circle2 = new Circle(centre2, radiusC2);

        //Create a new intersection object with circle 1 and circle 2
        intersection = new Intersection(circle1, circle2);

    }

    private static void displayCircleAreas(){
        //Get the area of both circles
        double areaCircle1 = intersection.getCircleA().calArea();
        double areaCircle2 = intersection.getCircleB().calArea();

        System.out.printf("The area of the first circle is %.2f", areaCircle1);
        System.out.printf("\nThe area of the second circle is %.2f", areaCircle2);
    }

    private static void displayIntersectionArea(){
        //Get the area of the intersection of both circles
        double intersectionArea = intersection.calIntersectionArea();

        System.out.printf("\nThe intersection area of the two circles is %.2f", intersectionArea);
    }

}
