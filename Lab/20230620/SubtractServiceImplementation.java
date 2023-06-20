import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubtractServiceImplementation extends UnicastRemoteObject implements SubtractService{
    public SubtractServiceImplementation() throws RemoteException{
        super();
    }

    @Override
    public int subtract(int a, int b) throws RemoteException{
        return a - b;
    }
}
