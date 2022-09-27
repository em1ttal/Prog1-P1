/**
 * EnRectangle.java
 * Question 9
 * @author eshaan
 */
import java.util.Scanner;

public class EnRectangle {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x of bottom left: ");
        x1 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter y of bottom left: ");
        y1 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter x of top right: ");
        x2 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter y of top right: ");
        y2 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter x of new point: ");
        x = sc.nextInt(); sc.nextLine();
        System.out.print("Enter y of new point: ");
        y = sc.nextInt(); sc.nextLine();
    }
}
