package com.intf;

public class BookManagerImp implements BookManagerIn{
        Book [] aa;




//
//    public BookManagerImp(Book[] aa) {
//        this.aa = aa;
//    }

    public BookManagerImp() {
        Book b1=new Book(1,"dsjnk","nvkj",2354);
        Book b2=new Book(2,"fdhb","ngfjkj",2354);
        Book b3 =new Book(3,"whk","bfjh",12);
        this.aa = new Book[]{b1, b2, b3};
    }

    @Override
    public void displayAllBooks() {

        for(Book i:aa){
            System.out.println(i);
        }

    }

    @Override
    public Book getBookWithId(int bookId) {
            for(int i=0;i< aa.length;i++){
                if(aa[i].getBookId() == bookId){
                    return aa[i];
                }

            }
            return null;

    }

    @Override
    public Book[] bookAuthor(String author) {
        Book[] bookByAuther=new Book[10];
        for(int i=0;i< aa.length;i++){
           if(aa[i].getAuthor().equals(author)){
               bookByAuther[i++]=aa[i];
           }

        }
        return bookByAuther;
    }

    @Override
    public Boolean searchBook(Book book) {
        //int flag;
        if( book ==null ){
            return false;
        }
        for (Book i : aa) {
            if (book.getBookId() == book.getBookId()) {
                return true; // Book exists
            }
        }
        return false;
    }
}
