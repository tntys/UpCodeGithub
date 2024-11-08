import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //     // Test Shape 
    //     System.out.println("Testing Shape:");
    //     Shape shape1 = new Shape();
    //     Shape shape2 = new Shape("blue", false);
        
    //     System.out.println("Default shape: " + shape1.toString());
    //     shape1.setColor("yellow");
    //     shape1.setFilled(true);
    //     System.out.println("Updated shape: " + shape1.toString());
        
    //     System.out.println("Custom shape: " + shape2.toString());
    //     System.out.println();

    //     // Test Circle 
    //     System.out.println("Testing Circle:");
    //     Circle circle1 = new Circle();
    //     Circle circle2 = new Circle(2.5);
    //     Circle circle3 = new Circle(5.0, "green", true);
        
    //     System.out.println("Default circle: " + circle1.toString());
    //     circle1.setRadius(3.0);
    //     circle1.setColor("red");
    //     circle1.setFilled(true);
    //     System.out.println("Updated circle: " + circle1.toString());
    //     System.out.println("Circle area: " + circle1.getArea());
    //     System.out.println("Circle perimeter: " + circle1.getPerimeter());
        
    //     System.out.println("Custom circle: " + circle3.toString());
    //     System.out.println("Circle3 area: " + circle3.getArea());
    //     System.out.println("Circle3 perimeter: " + circle3.getPerimeter());
    //     System.out.println();

    //     // Test Rectangle 
    //     System.out.println("Testing Rectangle:");
    //     Rectangle rectangle1 = new Rectangle();
    //     Rectangle rectangle2 = new Rectangle(3.0, 5.0);
    //     Rectangle rectangle3 = new Rectangle(4.0, 6.0, "purple", false);
        
    //     System.out.println("Default rectangle: " + rectangle1.toString());
    //     rectangle1.setWidth(2.0);
    //     rectangle1.setLength(4.0);
    //     rectangle1.setColor("orange");
    //     rectangle1.setFilled(false);
    //     System.out.println("Updated rectangle: " + rectangle1.toString());
    //     System.out.println("Rectangle area: " + rectangle1.getArea());
    //     System.out.println("Rectangle perimeter: " + rectangle1.getPerimeter());
        
    //     System.out.println("Custom rectangle: " + rectangle3.toString());
    //     System.out.println("Rectangle3 area: " + rectangle3.getArea());
    //     System.out.println("Rectangle3 perimeter: " + rectangle3.getPerimeter());
    //     System.out.println();

    //     // Test Square 
    //     System.out.println("Testing Square:");
    //     Square square1 = new Square();
    //     Square square2 = new Square(4.0);
    //     Square square3 = new Square(5.0, "black", true);
        
    //     System.out.println("Default square: " + square1.toString());
    //     square1.setSide(6.0);
    //     square1.setColor("white");
    //     square1.setFilled(true);
    //     System.out.println("Updated square: " + square1.toString());
    //     System.out.println("Square area: " + square1.getArea());
    //     System.out.println("Square perimeter: " + square1.getPerimeter());
        
    //     System.out.println("Custom square: " + square3.toString());
    //     System.out.println("Square3 area: " + square3.getArea());
    //     System.out.println("Square3 perimeter: " + square3.getPerimeter());

        Scanner input = new Scanner(System.in);

        // Circle
        System.out.println("Creating the Circle: Please enter the value for the Circle! ");
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.print("Enter the color of the circle: ");
        String circleColor = input.next(); // vi la color cua circle nen de la circleColor - may cai kia cung co nen de cho khac biet
        System.out.print("Is the circle filled (true/false): ");
        boolean circleFilled = input.nextBoolean();

        Circle circle = new Circle(radius, circleColor, circleFilled);
        System.out.println(circle);
        System.out.println();

        // Rectangle
        System.out.println("Creating the Rectangle: Please enter the value for the Rectangle!");
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter the length for the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the color of the rectangle: ");
        String rectangleColor = input.next();
        System.out.print("Is the rectangle filled (true/false): ");
        boolean rectangleFilled = input.nextBoolean();

        Rectangle rectangle = new Rectangle(width, length, rectangleColor, rectangleFilled);
        System.out.println(rectangle);
        System.out.println("The area of the Rectangle: " + rectangle.getArea());
        System.out.println("The perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println();

        // Square
        System.out.println("Creating the Square:  Please enter the value for the Square!");
        System.out.print("Enter the side of the square: ");
        double side = input.nextDouble();
        System.out.print("Enter the color of the square: ");
        String squareColor = input.next();
        System.out.print("Is the square filled ( true/false): ");
        boolean squareFilled = input.nextBoolean();

        Square square = new Square(side, squareColor, squareFilled);
        System.out.println(square);
        System.out.println();
        
    }
}
