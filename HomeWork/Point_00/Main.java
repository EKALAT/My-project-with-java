package Point_00;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Nhap toa do cua cac canh Hinh Tam Giac ---");
        Point[] vertice = new Point[3];
        String[] vertexNames = {"a", "b", "c"};
        for (int i = 0; i < 3; i++) {
            System.out.println("-- Toa do dien canh " + vertexNames[i] + " : ");
            System.out.print("Toa do x :");
            int x = scanner.nextInt();
            System.out.print("Toa do y:");
            int y = scanner.nextInt();
            vertice[i] = new Point(x, y);
        }
        Triangle triangle = new Triangle(vertice[0], vertice[1], vertice[2]);

        System.out.print(" -- Chu vi Hinh tam giac la: " + triangle.getPerimeter());
    }
}
