/**
 * EnRectangle.java
 * Question 9
 * @author eshaan
 */
import java.util.Scanner;
public class EnRectangle {
    public static void main(String[] args) {
        float x1, y1;  //Bottom left
        float x2, y2;  //Top right
        float x, y;    //Point to check
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x of bottom left: ");
        x1 = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter y of bottom left: ");
        y1 = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter x of top right: ");
        x2 = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter y of top right: ");
        y2 = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter x of new point: ");
        x = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter y of new point: ");
        y = sc.nextFloat(); sc.nextLine();

        if(x >= x1 && x <= x2 && y >= y1 && y <= y2)
            System.out.println("Point is inside the rectangle");
        else
            System.out.println("Point is outside the rectangle");
    }
}
