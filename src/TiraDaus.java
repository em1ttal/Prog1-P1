/**
 * TiraDaus.java
 * Question 34
 * @author eshaan
 */
import java.util.Scanner;

public class TiraDaus {
    public static void main(String[] args) {
        int user_total = 0;
        int comp_total = 0;
        String user_entry = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Computer's turn");

        while(comp_total <= 10) {
            int comp_throw = (int) (Math.random() * 6) + 1;
            System.out.println(comp_total + " + " + comp_throw + " = " + (comp_throw + comp_total));
            comp_total += comp_throw;
        }
        if(comp_total < 14) {
            System.out.println("Your turn");
            int user_throw = (int) (Math.random() * 6) + 1;
            System.out.println(user_total + " + " + user_throw + " = " + (user_total + user_throw));
            user_total += user_throw;
            while(user_total < 14 && !user_entry.equalsIgnoreCase("n")) {
                System.out.print("Throw dice (Y/N)?");
                user_entry =sc.nextLine();
                if(user_entry.equalsIgnoreCase("y")) {
                    user_throw = (int) (Math.random() * 6) + 1;
                    System.out.println(user_total + " + " + user_throw + " = " + (user_total + user_throw));
                    user_total += user_throw;
                }
            }
        } else
            System.out.println("Computer passed 13\nYou have won!");
        if((user_total < comp_total && comp_total > 13) || user_total > 13) {
            if(user_total > 13)
                System.out.println("You passed 13");
            System.out.println("Computer wins");
        }
        else if(user_total < 14 && user_total != 0)
            System.out.println("You have won!");
    }
}
