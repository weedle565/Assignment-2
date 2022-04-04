import java.util.Arrays;
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

        String[] separator1 = input.split(" ");

        Point centre1 = new Point(Double.parseDouble(separator1[0]), Double.parseDouble(separator1[1]));
        double radiusC1 = Double.parseDouble(separator1[2]);

        Circle circle1 = new Circle(centre1, radiusC1);

        System.out.println("Enter the Coordinate of centre point (x, y) and radius for the second circle");
        input = scanner.nextLine();

        String[] separator2 = input.split(" ");

        Point centre2 = new Point(Double.parseDouble(separator2[0]), Double.parseDouble(separator2[1]));
        double radiusC2 = Double.parseDouble(separator2[2]);

        Circle circle2 = new Circle(centre2, radiusC2);

        intersection = new Intersection(circle1, circle2);

    }

    private static void displayCircleAreas(){
        double areaCircle1 = intersection.getCircleA().calArea();
        double areaCircle2 = intersection.getCircleB().calArea();

        System.out.printf("The area of the first circle is %.2f", areaCircle1);
        System.out.printf("\nThe area of the second circle is %.2f", areaCircle2);
    }

    private static void displayIntersectionArea(){
        double intersectionArea = intersection.callIntersectionArea();

        System.out.printf("\nThe intersection area of the two circles is %.2f", intersectionArea);
    }

}
