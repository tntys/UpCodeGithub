public class Square extends Rectangle {
    public Square() {

    }

    public Square (double side) {
        super(side, side);
    }

    public Square (double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // dai = rong
    }

    public void setSide(double side) {
        // this.width = width;
        // this.length = length;
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square [ Rectangle [ Shape [ color = " +getColor()+ ", filled = " + isFilled() + 
                "], width =  " + getWidth() + ", length = " + getLength() + "]]";
    }
}
