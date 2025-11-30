package Shop;
import java.util.HashMap;


public class Inventory {
    private HashMap<String, Product> products;
    public Inventory() {
        products = new HashMap<>();
    }
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductCode())) {
            Product existing = products.get(product.getProductCode());
            existing.setQuantity(existing.getQuantity() + product.getQuantity());
        }
        else {
            products.put(product.getProductCode(), product);
        }
    }
    public void removeProduct(String code) {
        if (products.containsKey(code)) {
            products.remove(code);
            System.out.println("Product with code " + code + " removed.");
        }
        else {
            System.out.println("Product with code " + code + " not found.");
        }
    }
    public Product findProduct(String code) {
        if (products.containsKey(code)) {
            return products.get(code);
        }
        else {
            System.out.println("Product with code " + code + " not found.");
            return null;
        }
    }
    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
}
