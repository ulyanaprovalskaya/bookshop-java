package com.grsu.bookShop.service.bookShopFacade;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.book.BookGenre;
import com.grsu.bookShop.model.bookShop.BookShop;
import com.grsu.bookShop.model.users.Customer;
import com.grsu.bookShop.service.bookService.BookService;
import com.grsu.bookShop.service.bookService.BookServiceImpl;
import com.grsu.bookShop.service.bookShopService.BookShopService;
import com.grsu.bookShop.service.bookShopService.BookShopServiceImpl;
import com.grsu.bookShop.service.customerService.CustomerService;
import com.grsu.bookShop.service.customerService.CustomerServiceImpl;

import java.math.BigDecimal;
import java.util.List;

public class BookShopFacadeImpl implements BookShopFacade {
    BookService bookService = new BookServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    BookShopService bookShopService = new BookShopServiceImpl();


    @Override
    public void serializeBookShop(String filename) {
        bookShopService.serialize(filename);
    }

    @Override
    public BookShop deserializeBookShop(String filename) {
        return bookShopService.deserialize(filename);
    }

    @Override
    public BigDecimal getTotalPriceOfBookShop() {
        return bookShopService.getTotalPriceOfBookShop();
    }

    @Override
    public List<Book> getBooksByGivenProperty(String author) throws BooksNotFoundException {
        return bookService.getBooksByGivenProperty(author);
    }

    @Override
    public List<Book> getBooksByGivenProperty(BookGenre genre) throws BooksNotFoundException {
        return bookService.getBooksByGivenProperty(genre);
    }

    @Override
    public List<Book> getBooksByAuthor(String author) throws BooksNotFoundException {
        return bookShopService.getBooksByAuthor(author);
    }

    @Override
    public BigDecimal getCustomerCartCost(Customer customer) {
        return customerService.getCartCost(customer);
    }
}
