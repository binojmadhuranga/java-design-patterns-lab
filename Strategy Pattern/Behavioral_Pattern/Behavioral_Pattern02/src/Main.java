public class Main {

    public static void main(String[] args) {

        Navigator nav = new Navigator();

        // Car Route
        nav.setStrategy(new CarRoute());
        nav.navigate();

        // Walking Route
        nav.setStrategy(new WalkingRoute());
        nav.navigate();

        // Bike Route
        nav.setStrategy(new BikeRoute());
        nav.navigate();
    }
}