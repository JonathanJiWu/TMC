
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Enter the first string:");
        String input = scan.nextLine();
        System.out.println("Enter the second string:");
        String input2 = scan.nextLine();
        if (input.equals(input2)) {
            System.out.println("Same!");
        } else {
            System.out.println("Different");
        }
    }
}
