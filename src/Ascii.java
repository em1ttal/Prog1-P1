/**
 * Ascii.java
 * Question 28
 * @author eshaan
 */
import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        String user_entry;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        user_entry = sc.nextLine();

        for(int i = 0; i < user_entry.length(); i++) {
            int ascii = (int) user_entry.charAt(i);
            System.out.println(user_entry.charAt(i) + " " + ascii);
        }
    }
}
