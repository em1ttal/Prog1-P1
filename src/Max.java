/**
 * Max.java
 * Question 21
 * @author eshaan
 */
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int n;
        int max = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        n = sc.nextInt(); sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int aux = sc.nextInt(); sc.nextLine();
            if(max < aux)
                max = aux;
        }
        System.out.println("Max number entered: " + max);
    }
}
