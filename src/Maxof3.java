/**
 * Maxof3.java
 * Question 7
 * @author eshaan
 */
import java.util.Scanner;

public class Maxof3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt(); sc.nextLine();

        System.out.println("Maximum of three numbers is: " + Math.max(Math.max(num1, num2), num3));
    }
}
