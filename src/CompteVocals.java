/**
 * CompteVocals.java
 * Question 27
 * @author eshaan
 */
import java.util.Scanner;

public class CompteVocals {
    public static void main(String[] args) {
        String user_entry;
        int vocals = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        user_entry = sc.nextLine();
        user_entry = user_entry.toLowerCase();

        for(int i = 0; i < user_entry.length(); i++) {
            if(user_entry.charAt(i) == 'a' || user_entry.charAt(i) == 'e' ||
               user_entry.charAt(i) == 'i' || user_entry.charAt(i) == 'o' ||
               user_entry.charAt(i) == 'u')
                vocals++;
        }

        System.out.println("The frase contains " + vocals + " vocals");
    }
}
