package com.grsu.bookShop.service;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.book.BookGenre;

import java.util.List;

public interface BookService {

    List<Book> getBooksByGivenProperty(String author) throws BooksNotFoundException;

    List<Book> getBooksByGivenProperty(BookGenre genre) throws BooksNotFoundException;
}
