package collections.Projects.ShoppingCart;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        CartManager manager = new CartManager(cart);

        // Adding products
        cart.addProduct("Laptop", 999.99);
        cart.addProduct("Mouse", 49.99);
        cart.addProduct("Keyboard", 79.99);
        cart.addProduct("Monitor", 199.99);

        // Adding products to cart
        cart.addToCart("Mouse", 2);
        cart.addToCart("Laptop", 1);
        cart.addToCart("Keyboard", 1);
        cart.addToCart("Monitor", 1);

        // Display cart details
        manager.displayCartInOrder();
        manager.displayCartSortedByPrice();
        manager.displayTotalPrice();
    }
}
