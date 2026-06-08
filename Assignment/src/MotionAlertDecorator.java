public class MotionAlertDecorator extends DeviceDecorator {

    public MotionAlertDecorator(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {

        super.turnOn();

        System.out.println("Motion Alert Activated");
    }
}