public class problem7 {
    int productId;
    String descripation;
    double price;

    public problem7(String descripation, double price, int productId) {
        this.descripation = descripation;
        this.price = price;
        this.productId = productId;
    }

    public void displayDet(){
        System.out.println("{" +
                "descripation='" + descripation + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                '}');
    }
}
