public class Service extends Product{
    String serviceEng;
    int serviceDate;

    public Service() {
    }

    public Service(int productId, String descripation, double price, int serviceDate, String serviceEng) {
        super(productId, descripation, price);
        this.serviceDate = serviceDate;
        this.serviceEng = serviceEng;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceDate=" + serviceDate +
                ", serviceEng='" + serviceEng + '\'' +
                ", descripation='" + descripation + '\'' +
                ", price=" + price +
                ", productId=" + productId +
                '}';
    }
}
