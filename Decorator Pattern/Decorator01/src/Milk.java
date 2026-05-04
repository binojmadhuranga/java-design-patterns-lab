class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }
    public double cost() {
        return coffee.cost() + 20;
    }
}