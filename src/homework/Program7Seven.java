package homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and convert to degree
 * Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the temperature value in degree Fahrenheit: ");
        double f = scanner.nextDouble();
        Program7Seven object = new Program7Seven();
        double c = ((f - 32) * 5 / 9);
        object.celsius(c);
        scanner.close();
    }
    public void celsius(double c){
        System.out.println("Converted value in degree Celsius is: " + c);
    }
}
