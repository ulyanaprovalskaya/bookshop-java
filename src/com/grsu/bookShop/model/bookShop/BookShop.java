package com.grsu.bookShop.model.bookShop;

import com.grsu.bookShop.model.book.Book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookShop implements Serializable {

    private static BookShop bookShop;
    private List<Book> books;
    private Map<String, List<Book>> booksByAuthor;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
        createBooksByAuthor();
    }

    public Map<String, List<Book>> getBooksByAuthor() {
        return booksByAuthor;
    }

    public void setBooksByAuthor(Map<String, List<Book>> booksByAuthor) {
        this.booksByAuthor = booksByAuthor;
    }

    private BookShop(){

    }

    private BookShop(List<Book> books) {
        this.books = books;
        createBooksByAuthor();
    }

    public static BookShop getInstance(){
        if (bookShop == null)
            bookShop = new BookShop();
        return bookShop;
    }

    private void createBooksByAuthor(){
        if(booksByAuthor == null)
            booksByAuthor = new HashMap<>();

        for(Book book : books){
            String author = book.getAuthor();
            if(!booksByAuthor.containsKey(author)){
                booksByAuthor.put(author, getBooksByAuthor(author));
            }
        }
    }

    private List<Book> getBooksByAuthor(String author){
        List<Book> suitableBooks = new ArrayList<>();

        for(Book book : books){
            if(book.getAuthor().equals(author))
                suitableBooks.add(book);
        }

        return suitableBooks;
    }

    @Override
    public String toString() {
        return "BookShop:\n" + books;
    }
}
