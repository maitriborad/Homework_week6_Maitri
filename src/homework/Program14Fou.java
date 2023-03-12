package homework;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14Fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter width: ");
        double w = scanner.nextDouble();
        System.out.println("Please enter Height: ");
        double h = scanner.nextDouble();
        double a = w * h;
        double p = 2 * (w + h);
        System.out.println("Area of rectangle is = " + a);
        System.out.println("Perimeter of rectangle is = " + p);
        scanner.close();
    }
}
