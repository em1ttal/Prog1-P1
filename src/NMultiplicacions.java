/**
 * NMultiplicacions.java
 * Question 15
 * @author eshaan
 */
import java.util.Scanner;

public class NMultiplicacions {
    public static void main(String[] args) {
        int n;
        int real_answer;
        int user_answer;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of multiplications: ");
        n = sc.nextInt(); sc.nextLine();

        for(int i = 0; i < n; i++) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            real_answer = num1 * num2;
            System.out.println("What is " + num1 + " x " + num2 + "?");
            user_answer = sc.nextInt(); sc.nextLine();

            if(user_answer == real_answer)
                System.out.println("Well Done!");
            else
                System.out.println("You need to study the multiplication table");
        }
    }
}
