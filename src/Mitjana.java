/**
 * Mitjana.java
 * Question 20
 * @author eshaan
 */
import java.util.Scanner;

public class Mitjana {
    public static void main(String[] args) {
        int n;
        int average = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        n = sc.nextInt(); sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int aux = sc.nextInt(); sc.nextLine();
            average += aux;
        }
        average /= n;
        System.out.println("Average of numbers entered: " + average);
    }
}
