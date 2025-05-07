import java.rmi.*;

public class AddServer {
public static void main(String args[]) {
try { 
//create remote object
AddServerImpl addServerImpl = new AddServerImpl(); 
//bind the remote object
Naming.rebind("AddServer", addServerImpl);
System.out.println("server is started....");
}
catch (Exception e) {
System.out.println("Exception: "+ e);
}}}
