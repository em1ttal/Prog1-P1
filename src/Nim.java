/**
 * Nim.java
 * Question 33
 * @author eshaan
 */
import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        int tiles = 20 + (int) (Math.random() * (10));
        Scanner sc = new Scanner(System.in);
        int start_decider = (int) (Math.random() * 2);
        int comp_remove;
        int user_remove;

        System.out.println("We will play with " + tiles + " tiles.");
        if(start_decider == 0) {
            System.out.println("Computer starts");
            while(tiles != 0) {
                if(tiles > 1) {
                    comp_remove = (int) (Math.random() * 2) + 1;
                    tiles -= comp_remove;
                } else
                    comp_remove = 1;
                System.out.println("Computer removes " + comp_remove + " tiles.\nThere are " + tiles + " tiles left.");
                if (tiles != 0) {
                    System.out.print("How many tiles will you remove (1 or 2)? ");
                    user_remove = sc.nextInt(); sc.nextLine();
                    tiles -= user_remove;
                    System.out.println("You remove " + user_remove + " tiles.\nThere are " + tiles + " tiles left.");
                } else
                    System.out.println("The computer has won!");
            }
        } else {
            System.out.println("You start");
            while(tiles != 0) {
                System.out.print("How many tiles will you remove (1 or 2)? ");
                user_remove = sc.nextInt(); sc.nextLine();
                tiles-= user_remove;
                System.out.println("You remove " + user_remove + " tiles.\nThere are " + tiles + " tiles left.");
                if (tiles != 0) {
                    if(tiles > 1) {
                        comp_remove = (int) (Math.random() * 2) + 1;
                        tiles -= comp_remove;
                    } else
                        comp_remove = 1;
                    tiles -= comp_remove;
                    System.out.println("Computer removes " + comp_remove + " tiles.\nThere are " + tiles + " tiles left.");
                } else
                    System.out.println("You have won!");
            }
        }
    }
}
