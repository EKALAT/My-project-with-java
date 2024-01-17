public class Rectangle {
    private final double length;
    private final double width;
    private final double area;
    private final double perimeter;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
        this.perimeter = 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(2, 8);
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
    }
}   

