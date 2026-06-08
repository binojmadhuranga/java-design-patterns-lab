public class UserNotification implements DeviceObserver {

    private String userName;

    public UserNotification(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println(userName + " received: " + message);
    }
}