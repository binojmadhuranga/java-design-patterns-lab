public class PhilipsLight implements Device {

    @Override
    public void turnOn() {
        System.out.println("Philips Light ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Philips Light OFF");
    }

    @Override
    public String getName() {
        return "Philips Light";
    }
}