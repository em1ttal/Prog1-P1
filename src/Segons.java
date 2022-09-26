/**
 * Segons.java
 * Question 5
 * @author eshaan
 */
import java.util.Scanner;

public class Segons {
    public static void main(String[] args) {
        int seconds, days, hours, minutes;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        seconds = sc.nextInt(); sc.nextLine();

        days = seconds / 86400;
        seconds -= days * 86400;
        hours = seconds / 3600;
        seconds -= hours * 3600;
        minutes = seconds / 60;
        seconds -= minutes * 60;

        System.out.println(days + "d " + hours + "h " +
                            minutes + "m " + seconds + "s");
    }
}
