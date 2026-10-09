public class Date {
   private int date,month,year;



    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date>31){
            System.out.println("invalid Date");
        }

             this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>12){
            System.out.println("Invalid Month");
        }

              this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if(year<1983){
            System.out.println("invalid Year");
        }

            this.year = year;

    }

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
