import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // // Test create a Circle object
        // GeometricObject circle = new Circle(5.5); // Upcast Circle to GeometricObject
        
        // System.out.println(circle); // call String toString
        // System.out.println("Area: " + circle.getArea()); 
        // System.out.println("Perimeter: " + circle.getPerimeter()); 

        // // Downcast back to Circle to access Circle-specific methods
        // Circle c = (Circle) circle;
        // System.out.println("Radius: " + c.getRadius());

        // // End testing

        Scanner scanner =  new Scanner(System.in);

        // Circle

        System.out.println("Enter the data of the Circle! ");
        System.out.print("Enter the radius for the Circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Area = %.2f\n", circle.getArea());
        System.out.printf("Perimeter = %.2f\n", circle.getPerimeter());
   



    }
}