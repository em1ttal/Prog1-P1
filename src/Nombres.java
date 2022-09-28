/**
 * Nombres.java
 * Question 16
 * @author eshaan
 */
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        n = sc.nextInt(); sc.nextLine();

        for(int i = 1; i <= n; i++) {
            System.out.print(i);
            System.out.print((i != n)? ", " : "");
        }
    }
}
