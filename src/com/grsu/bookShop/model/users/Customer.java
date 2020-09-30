package com.grsu.bookShop.model.users;

import com.grsu.bookShop.model.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private List<Book> boughtBooks;
    private List<Book> cart;

    public List<Book> getBoughtBooks() {
        return boughtBooks;
    }

    public void setBoughtBooks(List<Book> boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    public List<Book> getCart() {
        return cart;
    }

    public void setCart(List<Book> cart) {
        this.cart = cart;
    }

    public Customer() {
        super();
        boughtBooks = new ArrayList<Book>();
        cart = new ArrayList<Book>();
    }

    public Customer(String login, String email, String password, List<Book> boughtBooks, List<Book> cart) {
        super(login, email, password);
        this.boughtBooks = boughtBooks;
        this.cart = cart;
    }

    @Override
    public void addBook(Book book) {
        cart.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        cart.remove(book);
    }
}
