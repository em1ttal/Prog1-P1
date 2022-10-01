import java.util.Scanner;

/**
 * EndevinarNombre.java
 * Question 37
 * @author eshaan
 */
public class EndevinarNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_guess = -10000;
        int comp_pick = 10000;
        String replay = "";

        System.out.println("Welcome to the game of number guessing!");

        /*
          Check if user has guessed number, and if user wants to replay after guessing
          First: First guess g
          Next: g + 1
          Last: User guesses and stops playing
          Cerca: User guesses the number and wants to stop the game
         */
        while(user_guess != comp_pick || replay.equalsIgnoreCase("s")) {
            comp_pick = (int) (Math.random() * 6);
            System.out.print("I am thinking of a number between 0 and 5...\nWhat do you think it is? ");
            user_guess = sc.nextInt(); sc.nextLine();
            if(user_guess < 0 || user_guess > 5)
                System.out.println("The number " + user_guess + " is invalid. Must be in range [0, 5]\n");
            else if (user_guess < comp_pick)
                System.out.println("The secret number was " + comp_pick + ", which is bigger than " + user_guess + "\n");
            else if (user_guess > comp_pick)
                System.out.println("The secret number was " + comp_pick + ", which is less than " + user_guess + "\n");
            else {
                System.out.println("You guessed that is was " + comp_pick + "! You won!\nWill you play again [s/n]? ");
                replay = sc.nextLine();
                System.out.println();
            }
        }
        System.out.println("See you later!");
    }
}
