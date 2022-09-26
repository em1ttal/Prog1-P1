/**
 * Digits.java
 * Question 2
 * @author eshaan
 */
import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        int user_entry;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        user_entry = sc.nextInt();
        sc.nextLine();

        if(user_entry < 10 && user_entry >= 0)
            System.out.println("It is a digit");
        else
            System.out.println("It is not a digit");
    }
}
