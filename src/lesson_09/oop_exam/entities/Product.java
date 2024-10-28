package lesson_09.oop_exam.entities;

public class Product {
    private static int autoId;
    private String productId;
    private String name;
    private Category category;
    private double price;
    private int quantity;

    public Product(String name, Category category, double price, int quantity) {
        this.productId = String.format("%04d", ++autoId);
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Product.autoId = autoId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
