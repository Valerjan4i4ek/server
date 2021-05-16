import java.rmi.RemoteException;

public class RemoteCalculationServer implements Calculator {

    @Override
    public int addition(int x, int y) throws RemoteException {
        return x + y;
    }

}