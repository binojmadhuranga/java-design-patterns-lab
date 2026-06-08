/*
 Composite Pattern

 Why?
 - Treat single devices and groups (rooms) uniformly.
 - Allows controlling all devices in a room with one command.
*/

public interface SmartHomeComponent {

    void turnOn();
    void turnOff();
}