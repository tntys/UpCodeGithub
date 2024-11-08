import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please enter side A, side b and side C for the triangle: ");
            double sideA = scanner.nextDouble();
            double sideB = scanner.nextDouble();
            double sideC = scanner.nextDouble();

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        System.out.println(triangle.verify());    
    }
}
