class DeliveryManager {
    private static DeliveryManager instance;

    private DeliveryManager() {
        System.out.println("Delivery Manager Created");
    }

    public static DeliveryManager getInstance() {
        if (instance == null) {
            instance = new DeliveryManager();
        }
        return instance;
    }

    public void trackDelivery(String orderId) {
        System.out.println("Tracking delivery: " + orderId);
    }
}