package com.grsu.bookShop.model.bookShop;

import com.grsu.bookShop.model.book.Book;

import java.util.List;

public class BookShop {

    private static BookShop bookShop;
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private BookShop(){

    }

    public static BookShop getInstance(){
        if (bookShop == null)
            bookShop = new BookShop();
        return bookShop;
    }
}
