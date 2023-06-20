import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SubtractServer {
    public static void main(String[] args) {
        try {
            SubtractService service = new SubtractServiceImplementation();
            Registry registry = LocateRegistry.createRegistry(1089);
            registry.bind("SubtractService", service);
            System.out.println("Server Started!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());   
        }
    }
}
