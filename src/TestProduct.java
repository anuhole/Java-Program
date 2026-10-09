import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {

      //  System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ProdectID:");
        int  id=sc.nextInt();

        System.out.println("Enter Description");
        String des=sc.next();

        System.out.println("Enter price");
        int price=sc.nextInt();


        System.out.println("Enter manus");
        String manu=sc.next();
        System.out.println("enter the warrenty in month");
        int war=sc.nextInt();

        System.out.println("enter Date service");
        int d1=sc.nextInt();

        System.out.println("enter Service Engeneering");
        String en1=sc.next();

       /* p1.displayDet();
        p2.displayDet();
        p3.displayDet();*/
        Product p1=new Product(id,des,price);
        Product p2=new Item(id,des,price,manu,war);
        Product p3=new Service(id,des,price,d1,en1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
