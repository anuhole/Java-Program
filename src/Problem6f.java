import java.util.Scanner;

public class Problem6f {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:- ");
        String word=sc.nextLine();

        int count=word.length();
        System.out.println("Length of Stringis "+count);

        for(int i=0;i<word.length();i++){
            System.out.print(word.substring(0,2));
        }
    }
}
