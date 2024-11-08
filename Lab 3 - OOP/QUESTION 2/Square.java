public class Square extends Rectangle {

    public Square() {
        
    }

    public Square(double side) {
       super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // dai rong = nhau
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    public String toString() {
        return "Square [ Rectangle [ Shape [ Color = " + getColor() + ", filled = " + isFilled() + "], width = "  + getWidth() + ", length = " + getLength() + "]]";
    }
}
