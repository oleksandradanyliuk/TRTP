package Shop;

public class Product {
    private String productCode;
    private String name;
    private int quantity;

    public Product(String productCode, String name, int quantity) {
        this.productCode = productCode;
        this.name = name;
        this.quantity = quantity;
    }
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString(){
        return "Product Code: " + this.productCode + ", Name: " + this.name + ", Quantity: " + this.quantity;
    }
}