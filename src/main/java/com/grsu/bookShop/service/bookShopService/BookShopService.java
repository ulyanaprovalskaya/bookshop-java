package com.grsu.bookShop.service.bookShopService;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.bookShop.BookShop;

import java.math.BigDecimal;
import java.util.List;

public interface BookShopService {

    void serialize(String filename);

    BookShop deserialize(String filename);

    BigDecimal getTotalPriceOfBookShop();

    List<Book> getBooksByAuthor(String author) throws BooksNotFoundException;
}
