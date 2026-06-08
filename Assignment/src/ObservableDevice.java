import java.util.ArrayList;
import java.util.List;

public class ObservableDevice {

    private List<DeviceObserver> observers = new ArrayList<>();

    public void addObserver(DeviceObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {

        for(DeviceObserver observer : observers){
            observer.update(message);
        }
    }
}