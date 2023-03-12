package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Program13Thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter Second number: ");
        int b = scanner.nextInt();
        System.out.println("Please enter Third number: ");
        int c = scanner.nextInt();
        int d = (a + b + c)/3;
        System.out.println("Average of all those number is:" + d);
        scanner.close();
    }
}