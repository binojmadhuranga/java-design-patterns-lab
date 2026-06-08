public class DeviceComponent implements SmartHomeComponent {

    private Device device;

    public DeviceComponent(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }
}