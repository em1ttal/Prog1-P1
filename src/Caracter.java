/**
 * Caracter.java
 * Question 13
 * @author eshaan
 */
import java.util.Scanner;

public class Caracter {
    public static void main(String[] args) {
        String user_word;
        int position;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        user_word = sc.nextLine();
        System.out.print("Enter position: ");
        position = sc.nextInt(); sc.nextLine();

        int max_position = user_word.length();
        if(position >= max_position)
            System.out.println("Index out of range");
        else
            System.out.println("In position " + position + " is the character: " + user_word.charAt(position));
    }
}
