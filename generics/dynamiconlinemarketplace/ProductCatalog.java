package generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Product<?>> {
    private List<T> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public void removeProduct(T product) {
        products.remove(product);
    }

    public List<T> getProducts() {
        return products;
    }

    public void displayProducts() {
        for (T product : products) {
            System.out.println(product);
        }
    }
}
