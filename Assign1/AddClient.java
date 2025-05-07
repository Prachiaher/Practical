import java.rmi.*;
import java.util.Scanner;

public class AddClient {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            // Get reference to the remote object
            String addServerURL = "rmi://localhost/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);

            System.out.println("The first number is: ");
            double d1 = sc.nextDouble();

            System.out.println("The second number is: ");
            double d2 = sc.nextDouble();

            System.out.println("....................Results..................");
            System.out.println("Addition is: " + addServerIntf.Addition(d1, d2));
            System.out.println("Subtraction is: " + addServerIntf.Subtraction(d1, d2));
            System.out.println("Multiplication is: " + addServerIntf.Multiplication(d1, d2));
            System.out.println("Division is: " + addServerIntf.Division(d1, d2));

        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }
}
