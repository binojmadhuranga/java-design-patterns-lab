public class Main {

    public static void main(String[] args) {

        // Factory Method
        Device light =
                DeviceFactory.createDevice("Philips");

        // Decorator
        light =
                new EnergyMonitorDecorator(light);

        light =
                new MotionAlertDecorator(light);

        // Observer
        ObservableDevice observable =
                new ObservableDevice();

        observable.addObserver(
                new UserNotification("Binoj"));

        // Composite
        Room livingRoom =
                new Room("Living Room");

        livingRoom.add(
                new DeviceComponent(light));

        livingRoom.turnOn();

        observable.notifyObservers(
                light.getName() + " turned ON");
    }
}