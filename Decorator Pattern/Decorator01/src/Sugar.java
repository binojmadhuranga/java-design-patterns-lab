class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }
    public double cost() {
        return coffee.cost() + 10;
    }
}
