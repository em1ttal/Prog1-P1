/**
 * FrasesPalindrom.java
 * Question 31
 * @author eshaan
 */
import java.util.Scanner;

public class FrasesPalindrom {
    public static void main(String[] args) {
        String user_entry = new String();
        Scanner sc = new Scanner(System.in);
        boolean palindrome = true;

        while(!user_entry.equalsIgnoreCase("fi")) {
            System.out.print("Enter a word: ");
            user_entry = sc.nextLine();
            user_entry = user_entry.toLowerCase();
            if(!user_entry.equalsIgnoreCase("fi")) {
                int i = 0;
                int j = user_entry.length() - 1;
                while (palindrome && i < user_entry.length() && j >= 0) {
                    if (user_entry.charAt(i) != user_entry.charAt(j))
                        palindrome = false;
                    i++;
                    j--;
                }

                if (palindrome)
                    System.out.println("Word is a palindrome");
                else
                    System.out.println("Word isn't a palindrome");
            }
        }
    }
}
