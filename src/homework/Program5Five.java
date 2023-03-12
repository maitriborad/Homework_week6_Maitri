package homework;

/***
 * 5. Write a program for a calculator with addition, subtraction, multiplication and
 * division methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Program5Five {
    static int s = 100;
    static int p = 10;
    public static void addition(){
        int ans = s + p;
        System.out.println("Addition of two number is: " + ans);
    }
    public static void subtraction(){
        int ans = s - p;
        System.out.println("Subtraction of two number is: " + ans);
    }
    public void multiplication(){
        Program5Five obj = new Program5Five();
        int ans = obj.s * obj.p;
        System.out.println("Multiplication of two number is: " + ans);
    }
    public void division(){
        Program5Five obj1 = new Program5Five();
        int ans = obj1.s / obj1.p;
        System.out.println("Division of two number is: " + ans);
    }

    public static void main(String[] args) {
        Program5Five obj2 = new Program5Five();
        addition();
        subtraction();
        obj2.multiplication();
        obj2.division();
    }
}
