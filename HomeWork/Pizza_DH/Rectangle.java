package Pizza_DH;

public class Rectangle implements Ishape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width + ", height: " + height;
    }
}
