package homework;

/**
 * Write a Java program to compute the specified expressions and print the output.
 * Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Program12Twe {
    double a = 25.5;
    double b = 3.5;
    double c = 40.5;
    double d = 4.5;
    public static void main(String[] args) {
        Program12Twe obj = new Program12Twe();
        double r = ((obj.a * obj.b - obj.b * obj.b) / (obj.c - obj.d));
        System.out.println(r);
    }
}
