/**
 * Concat.java
 * Question 14
 * @author eshaan
 */
import java.lang.StringBuffer;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        StringBuffer joined = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String aux = sc.nextLine();
        joined.append(aux);
        System.out.print("Enter a sentence: ");
        aux = sc.nextLine();
        joined.append(" " + aux);

        System.out.println("Joined sentence is:");
        System.out.println(joined);
    }
}

/*
Can not be done strings as a string can not be changed after being defined
 */
