package TMC;

import java.util.Scanner;

class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int first = scanner.nextInt();
        System.out.println("Give the second number:");
        int second = scanner.nextInt();
        System.out.println("Give the third number:");
        int third = scanner.nextInt();
        System.out.println("The average is "+1.0*(first+second+third)/3);
    }
}
