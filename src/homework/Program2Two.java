package homework;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2Two {
    static double d = 10.55;//static variable
    static double e = 20.55;//static variable
    //static methode
    public static void myMethode(){
        System.out.println(d);
        System.out.println(e);
    }

    public static void main(String[] args) {
        myMethode();
    }
}
