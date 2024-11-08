public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength () {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle [ Shape [ Color = "  + getColor()+ ", filled = " + isFilled() + "], width = " + getWidth() + ", length = " + getLength() + "]";
    }

   
}
