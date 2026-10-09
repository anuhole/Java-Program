public class  Item extends Product {
    int warranty;
    String manufactuar;

    public Item() {
    }

    public Item(int productId, String descripation, double price, String manufactuar, int warranty) {
        super(productId, descripation, price);
        this.manufactuar = manufactuar;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "manufactuar='" + manufactuar + '\'' +
                ", warranty=" + warranty +
                ", descripation='" + descripation + '\'' +
                ", price=" + price +
                ", productId=" + productId +
                '}';
    }
}
