
public class Triangle {
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;

    public Triangle(Point2D p1, Point2D p2, Point2D p3 ) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //Calculate the perimeter of the triangle: public double perimeter(). (perimeter: chu vi)
    public double perimeter() {
        double side1 = Point2D.distance(p1, p2);
        double side2 = Point2D.distance(p2, p3);
        double side3 = Point2D.distance(p3, p1);
        return side1 + side2 + side3;
    }

    //Calculate the area of the triangle: public double area(). (area: diện tích)
    public double area() {
        double side1 = Point2D.distance(p1, p2);
        double side2 = Point2D.distance(p2, p3);
        double side3 = Point2D.distance(p3, p1);
        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}