package com.grsu.bookShop.service.bookShopFacade;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.book.BookGenre;
import com.grsu.bookShop.model.bookShop.BookShop;
import com.grsu.bookShop.model.users.Customer;

import java.math.BigDecimal;
import java.util.List;

public interface BookShopFacade {

    void serializeBookShop(String filename);

    BookShop deserializeBookShop(String filename);

    BigDecimal getTotalPriceOfBookShop();

    List<Book> getBooksByGivenProperty(String author) throws BooksNotFoundException;

    List<Book> getBooksByGivenProperty(BookGenre genre) throws BooksNotFoundException;

    List<Book> getBooksByAuthor(String author) throws BooksNotFoundException;

    BigDecimal getCustomerCartCost(Customer customer);

}
