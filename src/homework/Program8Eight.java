package homework;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter base of Triangle: ");
        double b = scanner.nextDouble();
        System.out.println("Please enter height of Triangle: ");
        double h = scanner.nextDouble();
        double t = (b*h)/2;
        System.out.println("Area of Triangle is: " + t);
        scanner.close();
    }
}
