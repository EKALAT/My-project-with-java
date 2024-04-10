package Lesson;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to input dimensions
        System.out.println("!!!Enter the dimensions of box!!!");
        System.out.println("Enter the length :");
        int length = scanner.nextInt();
        System.out.println("Enter the width:");
        int width = scanner.nextInt();
        System.out.println("Enter the height:");
        int height = scanner.nextInt();
        Box abox = new Box();
        abox.setD(length);
        abox.setW(width);
        abox.setH(height);
        //Close scanner
        scanner.close();
        //print dimensions
        System.out.println("!!!Dimensions of the box!!!");
        System.out.println("Length = " +abox.getD());
        System.out.println("Width = " +abox.getW());
        System.out.println("Height = " +abox.getH());
        System.out.println("Volume of box = " + abox.Volume());
        System.out.println("Surface of box = " + abox.Surface());
    }
}
