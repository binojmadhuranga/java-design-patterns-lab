import java.util.ArrayList;
import java.util.List;

public class Room implements SmartHomeComponent {

    private String roomName;

    private List<SmartHomeComponent> devices =
            new ArrayList<>();

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public void add(SmartHomeComponent component) {
        devices.add(component);
    }

    @Override
    public void turnOn() {

        System.out.println("Turning ON Room : "
                + roomName);

        for (SmartHomeComponent component : devices) {
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {

        System.out.println("Turning OFF Room : "
                + roomName);

        for (SmartHomeComponent component : devices) {
            component.turnOff();
        }
    }
}