package homework;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3Three {
    int a = 5;//instance variable
    static int b = 10;//static variable
    public void myMethod(){

        System.out.println(a);
    }
    public static void yourMethod(){

        System.out.println(b);
    }
    public static void main(String [] args){
        Program3Three object = new Program3Three();
        object.myMethod();
        yourMethod();
    }
}
