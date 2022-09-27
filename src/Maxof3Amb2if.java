/**
 * Maxof3Amb2if.java
 * Question 8
 * @author eshaan
 */
import java.util.Scanner;

public class Maxof3Amb2if {
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

        if(num1 > num2 && num1 > num3)
            max = num1;
        else if(num2 > num3)
            max = num2;
        else
            max = num3;

        System.out.println("Maximum of three numbers is: " + max);
    }
}
