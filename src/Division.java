/**
 * Division.java
 * Question 4
 * @author eshaan
 */
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int dividend, divisor, quotient, residue;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a dividend: ");
        dividend = sc.nextInt(); sc.nextLine();
        System.out.print("Enter a divisor: ");
        divisor = sc.nextInt(); sc.nextLine();

        quotient = dividend / divisor;
        residue = dividend % divisor;

        System.out.println(dividend + " = " + divisor + " * " +
                            quotient + " + " + residue);
    }
}
