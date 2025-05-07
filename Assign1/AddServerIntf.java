import java.rmi.*;
interface AddServerIntf extends Remote { 
//method declaration 
double Addition(double d1, double d2) throws RemoteException;

double Subtraction(double d1, double d2) throws RemoteException;

double Multiplication(double d1, double d2) throws RemoteException;

double Division(double d1, double d2) throws RemoteException;
}
