package TMC;

import java.util.Scanner;

public class ExceptionHandling {
    //    In your file, create multiple variables with different data types like arrays, string, or integers.
//Think of ways you can break these variables.
//Create a try/catch for each variable. Create logic for that variable. Loop? Assignment? Get creative. Think of previous errors you’ve seen in your code.
//Create your catch blocks for each individual exceptions for each try/catch blocks.
//@here Don’t forget to take a break and work on these for afternoon lab. (edited)
    public static void main(String[] args) {
//    try{
//        int[] arr = {4, 5, 6};
//        System.out.println(arr[3]);
//    }catch (Exception e){
//        System.out.println("An exception happened!");
//    }
        Scanner scan = new Scanner(System.in);
        System.out.println("give number");
        int num = scan.nextInt();
        System.out.println(num);
    }
}
