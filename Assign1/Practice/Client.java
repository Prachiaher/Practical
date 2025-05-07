import java.rmi.*;
import java.util.Scanner;
public class Client{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String ServerUrl="rmi://localhost/Server";
            ServerIntf serverIntf=(ServerIntf) Naming.lookup(ServerUrl);

            System.out.println("Enter First Number :");
            Double d1=sc.nextDouble();
            System.out.println("Enter Second Number : ");
            Double d2=sc.nextDouble();

            System.out.println("Addition is:"+serverIntf.Addition(d1,d2));
            System.out.println("Subtraction is is:"+serverIntf.Subtraction(d1,d2));
            System.out.println("Multiplication is:"+serverIntf.Multiplication(d1,d2));
            System.out.println("Division is:"+serverIntf.Division(d1,d2));
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
            e.printStackTrace();
            
        }
    }
}
