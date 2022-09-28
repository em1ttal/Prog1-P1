/**
 * MultiplicaNombresAleatoris.java
 * Question 12
 * @author eshaan
 */
import java.util.Scanner;

public class MultiplicaNombresAleatoris {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int real_answer = num1 * num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is " + num1 + " x " + num2 + "?");
        int user_answer = sc.nextInt(); sc.nextLine();

        if(user_answer == real_answer)
            System.out.println("Well Done!");
        else
            System.out.println("You need to study the multiplication table");
    }
}
