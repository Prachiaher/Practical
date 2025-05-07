import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf {
//constructor
public AddServerImpl()throws RemoteException {
}
//implement method declared in the interface
public double Addition(double d1, double d2) throws RemoteException {
 return d1+d2; 
 }
 public double Subtraction(double d1, double d2) throws RemoteException {
 return d1-d2; 
 }
 public double Multiplication(double d1, double d2) throws RemoteException {
 return d1*d2; 
 }
 public double Division(double d1, double d2) throws RemoteException {
   return d1/d2;
 }
}
