package Shop;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        Product a1 = new Product("A0001", "Apple juice", 320);
        Product a2 = new Product("A0002", "Chocolate bar", 1200);
        Product a3 = new Product("A0003", " Sandwiches", 100);


        inventory.addProduct(a1);
        inventory.addProduct(a2);
        inventory.addProduct(a3);


        inventory.printAllProducts();


        System.out.println("\nSearching for product A0002:");
        Product found = inventory.findProduct("A0002");
        if (found != null) System.out.println(found);


        inventory.addProduct(new Product("A0002", "Chocolate bar", 18));
        System.out.println("\nAfter adding:");
        inventory.printAllProducts();


        System.out.println("\nRemoving product AO003:");
        inventory.removeProduct("A0003");
        inventory.printAllProducts();


        System.out.println("\nSearching for product:");
        inventory.findProduct("A0018");
    }
}
