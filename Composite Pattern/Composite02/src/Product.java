class Product implements CartItem {

    private double price;

    public Product(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}