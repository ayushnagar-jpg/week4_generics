package collections.Projects.ShoppingCart;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private Map<String, Double> productPrices;
    private Map<String, Integer> orderedCart;
    private Map<String, Double> sortedCart;

    public ShoppingCart() {
        productPrices = new HashMap<>(); // Stores product prices
        orderedCart = new LinkedHashMap<>(); // Maintains insertion order
        sortedCart = new TreeMap<>((a, b) -> Double.compare(productPrices.get(a), productPrices.get(b))); // Sorts by price
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            orderedCart.put(product, orderedCart.getOrDefault(product, 0) + quantity);
            sortedCart.put(product, productPrices.get(product));
        } else {
            System.out.println("Product not found: " + product);
        }
    }

    public Map<String, Integer> getOrderedCart() {
        return orderedCart;
    }

    public Map<String, Double> getSortedCart() {
        return sortedCart;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : orderedCart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }
}
