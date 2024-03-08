public class Rectangle implements IShape {
    private double width;
    private double length;

    public Rectangle(double width, double v) {
        this.width = width;
        this.length = v;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
