package com.grsu.bookShop.model.users;

import com.grsu.bookShop.model.bookShop.BookShop;
import com.grsu.bookShop.model.book.Book;

import java.util.List;

public class Admin extends User {

    private static List<Book> bookShopBooks = BookShop.getInstance().getBooks();

    public Admin() {
        super();
    }

    public Admin(String login, String email, String password) {
        super(login, email, password);
    }

    @Override
    public void addBook(Book book) {
        bookShopBooks.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookShopBooks.remove(book);
    }
}
