import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SubtractService extends Remote {
    int subtract(int a, int b) throws RemoteException;
}
