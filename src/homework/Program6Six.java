package homework;

import java.util.Scanner;

/***
 * Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */
public class Program6Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of circle:");
        int r = scanner.nextInt();
        Program6Six obj = new Program6Six();
        double a = Math.PI*(r * r);
        obj.radius(a);
        scanner.close();
    }
    public void radius(double a){
        System.out.println("Area of circle is: " + a);
    }
}
