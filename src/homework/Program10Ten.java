package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its multiplication table up to 10.
 * Test Data: Input a number:
 * 8 Expected Output : 8 x 1 = 8
 *                     8 x 2 = 16
 *                     8 x 3 = 24 ... 8 x 10 = 80
 */
public class Program10Ten {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int i = scanner.nextInt();
        System.out.println(i + " * 1 = " + (i * 1));
        System.out.println(i + " * 2 = " + (i * 2));
        System.out.println(i + " * 3 = " + (i * 3));
        System.out.println(i + " * 4 = " + (i * 4));
        System.out.println(i + " * 5 = " + (i * 5));
        System.out.println(i + " * 6 = " + (i * 6));
        System.out.println(i + " * 7 = " + (i * 7));
        System.out.println(i + " * 8 = " + (i * 8));
        System.out.println(i + " * 9 = " + (i * 9));
        System.out.println(i + " * 10 = " + (i * 10));
        scanner.close();
    }
}
