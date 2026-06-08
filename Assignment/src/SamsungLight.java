public class SamsungLight implements Device {

    @Override
    public void turnOn() {
        System.out.println("Samsung Light ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung Light OFF");
    }

    @Override
    public String getName() {
        return "Samsung Light";
    }
}