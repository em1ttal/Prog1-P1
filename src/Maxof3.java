/**
 * Maxof3.java
 * Question 7
 * @author eshaan
 */
import java.util.Scanner;

public class Maxof3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt(); sc.nextLine();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt(); sc.nextLine();

        max = (num1 > num2)? num1 : num2;
        max = (num3 > max)? num3 : max;

        System.out.println("Maximum of three numbers is: " + max);
    }
}
