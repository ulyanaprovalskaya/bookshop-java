package com.grsu.bookShop.service.bookShopService;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.bookShop.BookShop;
import com.grsu.bookShop.service.serializer.Serializer;

import java.math.BigDecimal;
import java.util.*;

public class BookShopServiceImpl implements BookShopService {

    BookShop bookShop = BookShop.getInstance();

    @Override
    public void serialize(String filename) {
        Serializer.<BookShop>serialize(bookShop, filename);
    }

    @Override
    public BookShop deserialize(String filename) {
        return Serializer.<BookShop>deserialize(filename);
    }

    @Override
    public int getTotalPriceOfBookShop() {
        BigDecimal totalPrice = new BigDecimal(0);

        return bookShop.getBooks().stream()
                .map(s -> s.getPrice())
                .mapToInt(BigDecimal::intValue).sum();
    }
}
