package homework;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4Four {
    int a = 11;//instance variable
    int b = 22;//instance variable
    static String s = "Maitri";
    static String s1 = "Borad";

    //instance method
    public void myMethode() {
        System.out.println("Instance methode");
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(s1);
    }
    //static methode
    public static void yourMethod() {
        System.out.println("static methode");
        System.out.println(s);
        System.out.println(s1);
        Program4Four object = new Program4Four();
        System.out.println(object.a);
        System.out.println(object.b);
    }

    public static void main(String[] args) {
        Program4Four obj = new Program4Four();
        obj.myMethode();
        yourMethod();
    }
}
