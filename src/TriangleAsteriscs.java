/**
 * TriangleAsteriscs.java
 * Question 22
 * @author eshaan
 */
import java.util.Scanner;

public class TriangleAsteriscs {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        n = sc.nextInt(); sc.nextLine();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
