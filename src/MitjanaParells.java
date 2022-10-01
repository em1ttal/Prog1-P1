import java.util.Scanner;

/**
 * MitjanaParells.java
 * Question 36
 * @author eshaan
 */
public class MitjanaParells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n: ");
        int n = sc.nextInt(); sc.nextLine();
        int average = 0, even_count = 0, aux;

        /*
          Count up to n entries
          First: User entry = 1
          Next: User entry = ue + 1
          Last: User entry = n
          Recorregut
         */
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            aux = sc.nextInt(); sc.nextLine();
            if(aux % 2 == 0) {
                average += aux;
                even_count++;
            }
        }
        System.out.println("Average of even numbers is: " + (average / even_count));
    }
}
