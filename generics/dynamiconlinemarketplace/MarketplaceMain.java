package generics.dynamiconlinemarketplace;
//main
public class MarketplaceMain {
    public static void main(String[] args) {
        // Creating Product Instances
        Product<ProductCategory> book = new Product<>("Java Programming", 50.00, ProductCategory.BOOKS);
        Product<ProductCategory> shirt = new Product<>("Cotton Shirt", 20.00, ProductCategory.CLOTHING);
        Product<ProductCategory> smartphone = new Product<>("Smartphone", 700.00, ProductCategory.GADGETS);

        // Creating Catalogs
        ProductCatalog<Product<ProductCategory>> catalog = new ProductCatalog<>();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(smartphone);

        // Displaying Products
        System.out.println("Products before discount:");
        catalog.displayProducts();

        // Applying Discounts
        MarketplaceUtility.applyDiscount(book, 10);
        MarketplaceUtility.applyDiscount(shirt, 5);
        MarketplaceUtility.applyDiscount(smartphone, 15);

        // Displaying Products After Discount
        System.out.println("\nProducts after discount:");
        catalog.displayProducts();
    }
}
