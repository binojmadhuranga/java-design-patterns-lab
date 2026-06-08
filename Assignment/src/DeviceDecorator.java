/*
 Decorator Pattern

 Why?
 - Add extra features dynamically.
 - No need to modify existing device classes.
 - Open/Closed Principle.
*/

public abstract class DeviceDecorator implements Device {

    protected Device device;

    public DeviceDecorator(Device device) {
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

    @Override
    public String getName() {
        return device.getName();
    }
}