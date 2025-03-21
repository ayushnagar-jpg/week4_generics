package collections.Projects.ShoppingCart;
import java.util.Map;

public class CartManager {
    private ShoppingCart cart;

    public CartManager(ShoppingCart cart) {
        this.cart = cart;
    }

    public void displayCartInOrder() {
        System.out.println("Cart Items (Order Added):");
        for (Map.Entry<String, Integer> entry : cart.getOrderedCart().entrySet()) {
            System.out.println(entry.getKey() + " x" + entry.getValue());
        }
    }

    public void displayCartSortedByPrice() {
        System.out.println("\nCart Items (Sorted by Price):");
        for (Map.Entry<String, Double> entry : cart.getSortedCart().entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }

    public void displayTotalPrice() {
        System.out.println("\nTotal Price: $" + cart.getTotalPrice());
    }
}
