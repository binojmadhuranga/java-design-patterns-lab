/*
 Factory Method Pattern

 Why?
 - Supports multiple device brands.
 - Client does not need to know which concrete class is created.
 - Easy to add new brands in future.
*/

    public class DeviceFactory {

    public static Device  createDevice(String brand) {

        if (brand.equalsIgnoreCase("Philips")) {
            return new PhilipsLight();
        }

        if (brand.equalsIgnoreCase("Samsung")) {
            return new SamsungLight();
        }

        throw new IllegalArgumentException("Invalid Brand");
    }
}