import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SubtractClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1089);
            SubtractService service = (SubtractService) registry.lookup("SubtractService");

            int a = 10;
            int b = 5;
            int result = service.subtract(a, b);
            System.out.println("Subtraction result: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
        }
    }
}
