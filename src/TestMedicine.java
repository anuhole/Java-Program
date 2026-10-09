import java.util.Scanner;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine [] m1=new Medicine[5];

        Scanner sc=new Scanner(System.in);
//        System.out.println("enter Date");
//        int date=sc.nextInt();
//
//        System.out.println("enter price");
//        int price=sc.nextInt();

        m1[0]=new Tablet();
        m1[1]=new Syrup();
        m1[2]=new Oinment();
        m1[3]=new Tablet();
        m1[4]=new Syrup();

        for(int i=0;i<m1.length;i++){
            m1[i].getdetails();
            m1[i].displayLabel();
        }
    }
}
