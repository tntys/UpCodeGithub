import java.util.Scanner;

public class DistanceTest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please enter the first value for x and y: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print(" Please enter the second value for x and y: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();


        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2, y2);
        System.out.printf(" The distance between x and y is: %.2f\n", point1.distance(point2));

    }
}
