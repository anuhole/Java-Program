import java.util.Scanner;

public class UseProblem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        problem7 [] p1 =new problem7[4];
        for (int i=0;i<p1.length;i++) {
            System.out.println("Enter the Product descripation");
            String des=sc.next();

            System.out.println("Enter the product ID");
            int id=sc.nextInt();

            System.out.println("Enter product price");
            int price=sc.nextInt();
            p1[i] = new problem7(des, price, id);

        }
        for (int i=0;i<p1.length;i++) {
            p1[i].displayDet();
        }



    }
}
