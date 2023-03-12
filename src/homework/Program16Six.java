package homework;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data: Input first binary number: 10 Input second binary number: 11
 * Expected Output: Sum of two binary numbers: 101
 */
public class Program16Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        String a = scanner.nextLine();
        System.out.println("Input second binary number: ");
        String b = scanner.nextLine();
        Program16Six obj = new Program16Six();
        obj.sum(a,b);
        scanner.close();
    }
    public void sum(String a, String b){
        int a1 = Integer.parseInt(a,2);
        int b1 = Integer.parseInt(b,2);
        int sum = a1 + b1;
        String r =  Integer.toBinaryString(sum);
        System.out.println("Your sum of two binary number is: " + r);
        return;
    }
}