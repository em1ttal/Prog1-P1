/**
 * Palindrom.java
 * Question 29
 * @author eshaan
 */
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        String user_entry;
        Scanner sc = new Scanner(System.in);
        boolean palindrome = true;

        System.out.print("Enter a word: ");
        user_entry = sc.nextLine();
        int i = 0;
        int j = user_entry.length() - 1;

        while (palindrome && i < user_entry.length() && j >= 0) {
            if(user_entry.charAt(i) != user_entry.charAt(j))
                palindrome = false;
            i++;
            j--;
        }

        if(palindrome)
            System.out.println("Word is a palindrome");
        else
            System.out.println("Word isn't a palindrome");
    }
}
