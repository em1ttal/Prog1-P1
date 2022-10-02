import java.util.Scanner;

/**
 * ParellsiSenars.java
 * Question 38
 * @author eshaan
 */
public class ParellsiSenars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_guess;
        String replay = "";
        int user_show, comp_show;

        System.out.println("Welcome to even or odd!\n");
        /*
          While user wants to replay
          First: First run
          Next: User says yes to replay
          Last: User says no
          Cerca: User says no to replay
         */
        while (!replay.equalsIgnoreCase("n")) {
            replay = "";
            user_show = 1000;
            System.out.print("Pick even or odd [pa/se]: ");
            user_guess = sc.nextLine();
            if(!user_guess.equalsIgnoreCase("pa") && !user_guess.equalsIgnoreCase("se")) {
                System.out.println("As you did not enter 'pa' or 'se', you will be defaulted to even.");
                user_guess = "pa";
            }
            /*
              While user shows out of range number
              First: Initial pick
              Next: User chose number out of range
              Last: User choice in range
              Cerca: User chooses number that is in range
             */
            while (user_show > 5 || user_show < 0) {
                System.out.print("How many fingers will you show? ");
                user_show = sc.nextInt(); sc.nextLine();
                if (user_show > 5 || user_show < 0)
                    System.out.println("You must enter a number between 0 and 5");
            }
            comp_show = (int) (Math.random() * 6);
            System.out.println("Computer shows: " + comp_show + " fingers");
            System.out.println("You show: " + user_show + " fingers");

            if ((user_guess.equalsIgnoreCase("pa") && (user_show + comp_show) % 2 == 0) ||
                (user_guess.equalsIgnoreCase("se") && (user_show + comp_show) % 2 != 0))
                System.out.println("You have won! Congratulations!");
            else
                System.out.println("The computer wins");
            /*
              While user chooses incorrect option
              First: Initial choice to replay
              Next: User chose number not an option
              Last: User choice is an option
              Cerca: User chooses valid option
             */
            while (!replay.equalsIgnoreCase("s") && !replay.equalsIgnoreCase("n")) {
                System.out.print("Do you want to play again [s/n]? ");
                replay = sc.nextLine();
                System.out.println();
            }
        }
        System.out.println("See you later!");
    }
}
