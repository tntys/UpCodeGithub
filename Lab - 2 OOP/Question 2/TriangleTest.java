import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x coordinate for point 1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y coordinate for point 1: ");
        int y1 = scanner.nextInt();
        Point2D p1 = new Point2D(x1, y1);

        System.out.print("Enter x coordinate for point 2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y coordinate for point 2: ");
        int y2 = scanner.nextInt();
        Point2D p2 = new Point2D(x2, y2);

        System.out.print("Enter x coordinate for point 3: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter y coordinate for point 3: ");
        int y3 = scanner.nextInt();
        Point2D p3 = new Point2D(x3, y3);
        
        Triangle myTriangle = new Triangle(p1,p2,p3);
        
        System.out.println("Perimeter of the triangle: " + myTriangle.perimeter());
        System.out.println("Area of the triangle: " + myTriangle.area());
    }
}

