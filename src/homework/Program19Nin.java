package homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19Nin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sentence: ");
        String name = scanner.nextLine();
        String result = name.toLowerCase();
        Program19Nin obj = new Program19Nin();
        obj.Case(result);
        scanner.close();
    }
    public void Case(String result){
        System.out.println("Result: " + result);
    }
}