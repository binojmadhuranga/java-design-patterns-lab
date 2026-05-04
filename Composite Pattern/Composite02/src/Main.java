import java.util.*;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(100);
        Product p2 = new Product(200);
        Cart cart = new Cart();
        cart.add(p1);
        cart.add(p2);
        System.out.println("Total: " + cart.getPrice());
    }
}