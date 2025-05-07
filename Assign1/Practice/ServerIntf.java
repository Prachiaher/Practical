import java.rmi.*;
interface ServerIntf extends Remote{
   Double Addition(Double d1,Double d2) throws RemoteException;
   Double Subtraction(Double d1,Double d2) throws RemoteException;
   Double Multiplication(Double d1,Double d2) throws RemoteException;
   Double Division(Double d1,Double d2) throws RemoteException;
}