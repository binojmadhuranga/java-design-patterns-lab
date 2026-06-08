public class EnergyMonitorDecorator extends DeviceDecorator {

    public EnergyMonitorDecorator(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {

        super.turnOn();

        System.out.println("Energy Monitoring Enabled");
    }
}