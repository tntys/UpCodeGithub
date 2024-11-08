import java.util.Scanner;

public class TestResizableCircle {
    private static final char[] resizableCircle = null;

    public static void main(String[] args) {
        //  //Test
        // Circle circle = new Circle(5);
        // System.out.println(circle);
        // System.out.println("Area: " + circle.getArea());
        // System.out.println("Perimeter: " + circle.getPerimeter());

        // ResizableCircle resizableCircle = new ResizableCircle(5);
        // System.out.println("\nBefore resizing:");
        // System.out.println(resizableCircle);
        // System.out.println("Area: " + resizableCircle.getArea());
        // System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        // resizableCircle.resize(10); // Resize by 10%
        // System.out.println("\nAfter resizing:");
        // System.out.println(resizableCircle);
        // System.out.println("Area: " + resizableCircle.getArea());
        // System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        //  //End Testing

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius for the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.printf("Area = %.2f\n", circle.getArea());
        System.out.printf("Perimeter = %.2f\n", circle.getPerimeter());
        System.out.println();

        ResizableCircle rCircle = new ResizableCircle(radius);
        System.out.println("ResizableCircle (Before resizing):");
        System.out.println(rCircle);
        System.out.printf("Area = %.2f\n", rCircle.getArea());
        System.out.printf("Perimeter = %.2f\n", rCircle.getPerimeter());

        System.out.print("\nEnter the resize percentage: ");
        int percent = scanner.nextInt(); 

        rCircle.resize(percent);
        System.out.println("\nResizableCircle (After resizing by " + percent + "%):");
        System.out.println(rCircle);
        System.out.printf("Area = %.2f\n", rCircle.getArea());
        System.out.printf("Perimeter = %.2f\n", rCircle.getPerimeter());

        scanner.close();
    }
}


