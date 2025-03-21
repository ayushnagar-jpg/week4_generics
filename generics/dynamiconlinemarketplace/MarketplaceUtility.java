package generics.dynamiconlinemarketplace;

public class MarketplaceUtility {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(newPrice);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + newPrice);
    }
}