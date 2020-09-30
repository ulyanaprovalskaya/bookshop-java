package com.grsu.bookShop.service;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.book.BookGenre;

import java.util.List;

public class AudioBookServiceImpl implements BookService{

    @Override
    public List<Book> getBooksByGivenProperty(String author) throws BooksNotFoundException {
        //some implementation
        //...

        return null;
    }

    @Override
    public List<Book> getBooksByGivenProperty(BookGenre genre) throws BooksNotFoundException {
        //some implementation
        //...

        return null;
    }
}
