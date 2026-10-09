public abstract class Medicine {
    int price;
    String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getdetails(){
        System.out.println("Price is:- "+price+"Expiry Date "+date);
    }


    //    @Override
//    public String toString() {
//        return "Medicine{" +
//                "date='" + date + '\'' +
//                ", price=" + price +
//                '}';
//    }

    public abstract void displayLabel();
}
