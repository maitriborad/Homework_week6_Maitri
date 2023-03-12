package homework;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program15Fif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();
        System.out.println("Your numbers are before swapping: " + a + " and " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Your numbers are after swapping: " + a + " and " + b);
        Program15Fif obj = new Program15Fif();
        obj.swap();
        scanner.close();
    }
    public void swap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first name: ");
        String a = scanner.nextLine();
        System.out.println("Input second name: ");
        String b = scanner.nextLine();
        System.out.println("Your names are before swapping: " + a + " and " + b);
        String z = a;
        a = b;
        b = z;
        System.out.println("Your names are after swapping: " + a + " and " + b);
        scanner.close();
    }
}
