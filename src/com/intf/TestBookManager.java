package com.intf;
import java.util.Arrays;
public class TestBookManager {
    public static void main(String[] args) {
        BookManagerImp book=new BookManagerImp();


        book.displayAllBooks();

        System.out.println("id:1 display details");
        Book b1=book.getBookWithId(1);
        if(b1==null){
            System.out.println("Book is not exit");
        }
        else{
            System.out.println(b1);
        }


        System.out.println("authar  display details");
        Book[] b2=book.bookAuthor("nvkj");
        for(Book i:b2) {
            if (b2 != null) {
                System.out.println(b2);
            }
        }
        }






    }

