/*
 Observer Pattern

 Why?
 - Notify users whenever device state changes.
 - Multiple users can subscribe.
 - Loose coupling between device and users.
*/

public interface DeviceObserver {
    void update(String message);
}