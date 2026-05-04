public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Sugar(new Milk(new BasicCoffee()));
        System.out.println("Total Cost: " + coffee.cost());
    }
}