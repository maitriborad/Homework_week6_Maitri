package homework;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        String result = name.toLowerCase();
        Program9Nine obj = new Program9Nine();
        obj.Case(result);
        scanner.close();
    }
    public void Case(String result){
        System.out.println("Result: " + result);
    }
}
