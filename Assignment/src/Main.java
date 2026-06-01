public class Main {

    public static void main(String[] args) {

        System.out.println("===== SMART FOOD DELIVERY MANAGEMENT SYSTEM =====\n");

        // ==================================================
        // Task 01 - Singleton Pattern
        // ==================================================
        System.out.println("TASK 01 - SINGLETON PATTERN");

        DeliveryManager manager =
                DeliveryManager.getInstance();

        manager.trackDelivery("ORD-001");

        System.out.println();


        // ==================================================
        // Task 02 - Strategy Pattern
        // ==================================================
        System.out.println("TASK 02 - STRATEGY PATTERN");

        PaymentContext payment1 =
                new PaymentContext(new CODPayment());

        PaymentContext payment2 =
                new PaymentContext(new KokoPayment());

        PaymentContext payment3 =
                new PaymentContext(new CardPayment());

        payment3.executePayment(5000);

        System.out.println();


        // ==================================================
        // Task 03 - Observer Pattern
        // ==================================================
        System.out.println("TASK 03 - OBSERVER PATTERN");

        Order order = new Order();

        Customer customer1 =
                new Customer("Binoj");

        Customer customer2 =
                new Customer("John");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Order Confirmed");
        order.setStatus("Food Preparing");
        order.setStatus("Out For Delivery");

        System.out.println();


        // ==================================================
        // Task 05 - Composite Pattern
        // ==================================================
        System.out.println("TASK 05 - COMPOSITE PATTERN");

        MenuCategory mainMenu =
                new MenuCategory("Restaurant Menu");

        MenuCategory burgers =
                new MenuCategory("Burger Category");

        MenuCategory drinks =
                new MenuCategory("Drink Category");

        burgers.add(new FoodItem("Chicken Burger"));
        burgers.add(new FoodItem("Beef Burger"));

        drinks.add(new FoodItem("Coca Cola"));
        drinks.add(new FoodItem("Orange Juice"));

        mainMenu.add(burgers);
        mainMenu.add(drinks);

        mainMenu.display();

        System.out.println("\n===== SYSTEM EXECUTION COMPLETED =====");
    }
}