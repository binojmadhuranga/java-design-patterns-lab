class ShoppingCart {

    private PaymentStrategy strategy;

    // Set Strategy
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Use Strategy
    public void checkout(int amount) {
        strategy.pay(amount);
    }
}