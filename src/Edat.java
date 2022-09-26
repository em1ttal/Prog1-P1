/**
 * Edat.java
 * Question 3
 * @author eshaan
 */
import java.util.Scanner;

public class Edat {
    public static void main(String[] args) {
        int user_age;
        int birth_year, future_age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        user_age = sc.nextInt();
        sc.nextLine();
        birth_year = 2022 - user_age;
        future_age = 2040 - birth_year;

        System.out.println("You were born in " + birth_year +
                            ". And in the year 2040 you will be " +
                            future_age + " years old.");
    }
}
