/**
 * Fibonacci.java
 * Question 26
 * @author eshaan
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers of fibonacci? ");
        n = sc.nextInt(); sc.nextLine();

        int a = 0;
        int b = 1;
        int c;
        System.out.print(b + ", ");
        for(int i = 1; i < n; i++) {
            c = a + b;
            System.out.print(c);
            System.out.print((i < n - 1)? ", " : "");
            a = b;
            b = c;
        }
    }
}
