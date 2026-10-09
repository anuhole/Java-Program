public class Product {
    int productId;
    String descripation;
    double price;

    public Product() {
    }

    public Product(int productId, String descripation, double price) {
        this.productId = productId;
        this.descripation = descripation;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "descripation='" + descripation + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                '}';
    }
}
