/**
 * Intervals.java
 * Question 11
 * @author eshaan
 */
import java.util.Scanner;

public class Intervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1, x2; //Interval 1
        float y1, y2; //Interval 2

        System.out.print("Enter lower bound of interval 1: ");
        x1 = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter upper bound of interval 1: ");
        x2 = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter lower bound of interval 2: ");
        y1 = sc.nextFloat(); sc.nextLine();
        System.out.print("Enter upper bound of interval 2: ");
        y2 = sc.nextFloat(); sc.nextLine();

        if((x2 > y1 && x2 < y2) || (x1 < y2 && x1 > y1))
            System.out.println("Intervals intersect");
        else
            System.out.println("Intervals do not intersect");
    }
}
