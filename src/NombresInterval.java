/**
 * NombresInterval.java
 * Question 19
 * @author eshaan
 */
import java.util.Scanner;

public class NombresInterval {
    public static void main(String[] args) {
        int upper_bound;
        int lower_bound;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        upper_bound = sc.nextInt(); sc.nextLine();
        System.out.print("Enter the lower bound: ");
        lower_bound = sc.nextInt(); sc.nextLine();

        for(int i = upper_bound; i >= lower_bound; i--) {
            System.out.print(i);
            System.out.print((i != lower_bound)? ", " : "");
        }
    }
}
