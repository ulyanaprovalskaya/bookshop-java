package com.grsu.bookShop.service.bookService;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.book.BookGenre;
import com.grsu.bookShop.model.bookShop.BookShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService{

    private static List<Book> bookShopBooks = BookShop.getInstance().getBooks();
    private static Map<String, List<Book>> bookShopBooksByAuthor = BookShop.getInstance().getBooksByAuthor();

    @Override
    public List<Book> getBooksByGivenProperty(String author) throws BooksNotFoundException {
        List<Book> suitableBooks = new ArrayList<>();
        for(Book book : bookShopBooks){
            if(book.getAuthor().equals(author))
                suitableBooks.add(book);
        }

        if(suitableBooks.size() == 0) throw new BooksNotFoundException("No books were found");
        else return suitableBooks;
    }

    @Override
    public List<Book> getBooksByGivenProperty(BookGenre genre) throws BooksNotFoundException {
        List<Book> suitableBooks = new ArrayList<>();
        for(Book book : bookShopBooks){
            if(book.getGenre().equals(genre))
                suitableBooks.add(book);
        }

        if(suitableBooks.size() == 0) throw new BooksNotFoundException("No books were found");
        else return suitableBooks;
    }

}
