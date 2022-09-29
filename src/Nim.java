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
        int decider = (int) (Math.random() * 2);

        if(decider == 0) {
            System.out.println("Computer starts");
            while(tiles != 0) {

            }
        } else {
            System.out.println("You start");
            while(tiles != 0) {

            }
        }
    }
}
