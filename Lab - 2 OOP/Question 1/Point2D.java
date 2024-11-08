import java.util.Scanner;

public class Point2D {

    private int x;
    private int y;

    //Constructor 1
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    //Constructor 2
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Constructor 3
    public Point2D(Point2D p) {
        this.x = p.getX();
        this.y = p.getY();
    }

        // getter and setter for private attributes!!!

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Enter the coordinates for the point from the keyboard: public void input().
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the x cordinate: ");
        setX(scanner.nextInt());
        System.err.print(" Enter the y cordinate: ");
        setY(scanner.nextInt());
    }

    // Returns a string representing the coordinates of the point as “(x, y)”: public String ToString().
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    //Move point to new coordinate: public void move(int x, int y).
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Check if the point is origin (0,0): public boolean isOrigin()
    public boolean isOrigin() {
        return ( x == 0 && y == 0);
    }

    // Function to calculate the distance from point to point p: public double distance(Point2D p).
    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }

    // Static function to calculate the distance between two points p1 and p2: public static doubledistance(Point2D p1, Point2D p2)
    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
    }
}
