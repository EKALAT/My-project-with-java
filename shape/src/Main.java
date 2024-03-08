public class Main {
    public static void main(String[] args) {
        // Create objects for Circle and Rectangle
        IShape circle = new Circle(6.0); // Circle with radius 6
        IShape rectangle = new Rectangle(3.0, 2.0); // Rectangle with width 3.0 and length 2.0

        // Create an array of shapes
        IShape[] shapes = {circle, rectangle};

        // Iterate through the array of shapes and display information for each shape
        for (IShape shape : shapes) {
            // Get the name of the class
            String shapeName = shape.getClass().getSimpleName();
            // Display information for the shape
            System.out.println("Shape: " + shapeName);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}
