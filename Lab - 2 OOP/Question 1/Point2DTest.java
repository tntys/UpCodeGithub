
public class Point2DTest {
    
    public static void main(String[] args) {
        
    // test constructor 
    //   Point2D p = new Point2D();
    //   System.out.println("Enter the x cordinate: " + p.getX());
    //   System.out.println("Enter the y cordinate: " + p.getY());
    //   System.out.println("Point created at origin (0, 0)");
    //   System.out.println("Point created at (" + x + ", " + y + ")");

        Point2D p1 = new Point2D(); //constructor 1
        System.out.println("p1 (origin): " + p1.toString());

        Point2D p2 = new Point2D(3,7); //constructor 2
        System.out.println("p2: " + p2.toString());

        Point2D p3 = new Point2D(p2); // constructor 3
        System.out.println("p3 (copy of p2): " + p3.toString());

        p1.input(); //user input
        System.out.println("After input, p1: " + p1.toString());

        // move p1
        p1.move(6, 9);
        System.out.println("After moving, p1: " + p1.toString());

        // check p1 origin
        if (p1.isOrigin()) {
            System.out.println("p1 is at the origin");
        } else {
            System.out.println("p1 is not at the origin");
        }

        // calculate distance between p1 and p2
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        // calculate static distance between p2 and p3
        System.out.println("Static distance between p2 and p3: " + Point2D.distance(p2, p3));
    }
}

