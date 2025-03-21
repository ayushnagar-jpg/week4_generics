package generics.warehouse;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.50));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.75));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 2.99));
        groceriesStorage.addItem(new Groceries("Milk", 1.50));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 45.00));
        furnitureStorage.addItem(new Furniture("Table", 120.00));

        System.out.println("Electronics Storage:");
        electronicsStorage.displayItems();

        System.out.println("\nGroceries Storage:");
         groceriesStorage.displayItems();

        System.out.println("\nFurniture Storage:");
        furnitureStorage.displayItems();

        // Display all items using wildcard method\
        System.out.println("\nDisplaying all stored items:");
        WarehouseUtility.displayAllItems(electronicsStorage.getItems());
        WarehouseUtility.displayAllItems(groceriesStorage.getItems());
        WarehouseUtility.displayAllItems(furnitureStorage.getItems());
    }
}
