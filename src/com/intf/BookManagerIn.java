package com.intf;

public interface BookManagerIn {
    public void displayAllBooks();

    public Book getBookWithId(int bookId);

    public Book[] bookAuthor(String author);

    public Boolean searchBook(Book boo);

}
