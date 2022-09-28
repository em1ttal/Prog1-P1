/**
 * Asteriscs.java
 * Question 17
 * @author eshaan
 */
import java.util.Scanner;

public class Asteriscs {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        n = sc.nextInt(); sc.nextLine();

        for(int i = 0; i < n; i++)
            System.out.print("*");
    }
}
