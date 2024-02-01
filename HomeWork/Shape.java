import java.util.Scanner;

abstract class Shape {
    protected double area;
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    static class Rectangle extends Shape {
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            super("Rectangle");
            this.width = width;
            this.length = length;
        }

        @Override
        public double calculateArea() {
            this.area = width * length;
            return this.area;
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            this.area = Math.PI * radius * radius;
            return this.area;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều rộng và chiều dài cho hình chữ nhật
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double length = scanner.nextDouble();

        // Tạo đối tượng rectangle1
        Shape rectangle1 = new Rectangle(width, length);

        // In diện tích hình chữ nhật
        System.out.println("Dien tich hinh chu nhat la: " + rectangle1.calculateArea());

        // Nhập bán kính cho hình tròn
        System.out.print("Nhap ban kinh hinh tron: ");
        double radius = scanner.nextDouble();

        // Tạo đối tượng circle1
        Shape circle1 = new Circle(radius);

        // In diện tích hình tròn
        System.out.println("Dien tich hinh tron la: " + circle1.calculateArea());

        scanner.close();
    }
}
