import java.util.Scanner;

public class problem6g {
    Scanner sc=new Scanner(System.in);
    public void nameLength(){

        System.out.println("how many Strings you want to enter");
        int num=sc.nextInt();
        String [] emp=new String[num];

        System.out.println("Enter String "+num);
        for(int i=0;i< emp.length;i++){
            emp[i]=sc.next();
        }
        System.out.println("Strings length is  more than 4 ");
        for (int i=0;i< emp.length;i++){
            if(emp[i].length()>4){
                System.out.println(emp[i]);
            }
        }
    }

    public static void main(String[] args) {
        problem6g p1=new problem6g();
        p1.nameLength();
    }

}
