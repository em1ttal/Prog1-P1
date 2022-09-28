/**
 * MinRectangle.java
 * Question 10
 * @author eshaan
 */
import java.util.Scanner;

public class MinRectangle {
    public static void main(String[] args) {
        //First rectangle
        float r1bx, r1by;  //Bottom left
        float r1tx, r1ty;  //Top right
        //Second rectangle
        float r2bx, r2by;  //Bottom left
        float r2tx, r2ty;  //Top right
        Scanner sc = new Scanner(System.in);
        boolean intersection = false;
        //First rectangle coordinates
        System.out.print("Enter x of bottom left (Rectangle 1): ");
        r1bx = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter y of bottom left (Rectangle 1): ");
        r1by = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter x of top right (Rectangle 1): ");
        r1tx = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter y of top right (Rectangle 1): ");
        r1ty = sc.nextFloat(); sc.nextLine();
        //Second rectangle coordinates
        System.out.print("Enter x of bottom left (Rectangle 2): ");
        r2bx = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter y of bottom left (Rectangle 2): ");
        r2by = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter x of top right (Rectangle 2): ");
        r2tx = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter y of top right (Rectangle 2): ");
        r2ty = sc.nextFloat(); sc.nextLine();

        if (((r1bx <= r2tx && r1bx >= r2bx) || (r1tx <= r2tx && r1tx >= r2bx))
        && ((r1by <= r2ty && r1by >= r2by) || (r1ty <= r2ty && r1ty >= r2by)))
            intersection = true;

        if(intersection) {
            //TODO
        } else
            System.out.println("No intersection, no minimum rectangle");
    }
}
