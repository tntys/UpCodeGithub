import java.util.Scanner;

public class TestCircle {
    public static void main (String[] args) {
        // Circle c1 = new Circle(3.5);
        // Circle c2 = new Circle(4);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius for the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Area = %.2f\n", circle.getArea());
        System.out.printf("Perimeter = %.2f\n", circle.getPerimeter());
    }
}
