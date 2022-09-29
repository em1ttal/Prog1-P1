/**
 * NombreDeDigits.java
 * Question 24
 * @author eshaan
 */
import java.util.Scanner;

public class NombreDeDigits {
    public static void main(String[] args) {
        int user_entry;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        user_entry = sc.nextInt(); sc.nextLine();

        int len = Integer.toString(user_entry).length();
        System.out.println("The number of digits in " + user_entry + " is " + len);
    }
}
