/**
 * Distancia.java
 * Question 6
 * @author eshaan
 */
import java.util.Scanner;
import java.lang.Math;

public class Distancia {
    public static void main(String[] args) {
        int x1, y1;
        int x2, y2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x of point 1: ");
        x1 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter y of point 1: ");
        y1 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter x of point 2: ");
        x2 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter y of point 2: ");
        y2 = sc.nextInt(); sc.nextLine();

        double x_diff = Math.pow(x1 - x2, 2);
        double y_diff = Math.pow(y1 - y2, 2);
        double distance = Math.sqrt(x_diff + y_diff);

        System.out.println("Distance between points: " + distance);
    }
}
