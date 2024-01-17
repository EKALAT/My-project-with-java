public class Point {
    private final double x;
    private final double y;

    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(double x2, double y2) {
        return Math.hypot(this.x - x2, this.y - y2);
    }

    public double distance(Point another) {
        return Math.hypot(this.x - another.x, this.y - another.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        // Example usage
        Point point1 = new Point();
        Point point2 = new Point(3.0, 4.0);
        System.out.println("Distance between points: " + point1.distance(point2));
    }
}

