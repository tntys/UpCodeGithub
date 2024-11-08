public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle [radius=" + getRadius() + "]";
    }

    @Override
    public void resize(int percent) {
        radius *= (1 + percent / 100.0);
    }
}
