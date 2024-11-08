import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please enter the value for the width and height: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);

        rectangle.visualize();

    }
}