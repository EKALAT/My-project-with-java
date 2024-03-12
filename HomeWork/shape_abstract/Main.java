package shape_abstract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông số hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double circleRadius = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập màu sắc hình tròn: ");
        String circleColor = scanner.nextLine().trim();

        System.out.print("Nhập trạng thái tô hình tròn (true/false): ");
        boolean circleFilled = scanner.nextBoolean();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập boolean

        // Nhập thông số hình chữ nhật
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rectangleWidth = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double rectangleLength = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập màu sắc hình chữ nhật: ");
        String rectangleColor = scanner.nextLine().trim();

        System.out.print("Nhập trạng thái tô hình chữ nhật (true/false): ");
        boolean rectangleFilled = scanner.nextBoolean();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập boolean

        // Nhập thông số hình vuông
        System.out.print("Nhập cạnh hình vuông: ");
        double squareSide = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập màu sắc hình vuông: ");
        String squareColor = scanner.nextLine().trim();

        System.out.print("Nhập trạng thái tô hình vuông (true/false): ");
        boolean squareFilled = scanner.nextBoolean();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập boolean

        // Tạo các hình
        Circle circle = new Circle(circleRadius, circleColor, circleFilled);
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength, rectangleColor, rectangleFilled);
        Square square = new Square(squareSide, squareColor, squareFilled);

        // In thông tin các hình
        System.out.println("Hình tròn:");
        System.out.println("Diện tích Hình tròn: " + circle.getArea());
        System.out.println("Chu vi Hình tròn: " + circle.getPerimeter());
        System.out.println(circle.toString());

        System.out.println("Hình chữ nhật:");
        System.out.println("Diện tích Hình chữ nhật: " + rectangle.getArea());
        System.out.println("Chu vi Hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        System.out.println("Hình vuông:");
        System.out.println("Diện tích Hình vuông: " + square.getArea());
        System.out.println("Chu vi Hình vuông: " + square.getPerimeter());
        System.out.println(square.toString());
    }
}
