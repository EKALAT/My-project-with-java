package shape_abstract;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // Can be kept for clarity
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getWidth() + // Access width directly
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
