package homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number : 5
 * Expected Output Binary number is: 101
 */
public class Program17Sev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number in decimal: ");
        int d = scanner.nextInt();
        String b = Integer.toBinaryString(d);
        System.out.println("Converted value is: " + b);
        scanner.close();
    }
}
