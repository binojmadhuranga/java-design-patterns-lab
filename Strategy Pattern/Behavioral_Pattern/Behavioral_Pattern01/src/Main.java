public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Credit Card Payment
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(5000);

        // PayPal Payment
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(3000);

        // Cash Payment
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(1000);
    }
}