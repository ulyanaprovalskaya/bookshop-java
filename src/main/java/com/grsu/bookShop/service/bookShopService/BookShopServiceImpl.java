package com.grsu.bookShop.service.bookShopService;

import com.grsu.bookShop.exception.BooksNotFoundException;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.bookShop.BookShop;
import com.grsu.bookShop.service.serializer.Serializer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    public BigDecimal getTotalPriceOfBookShop() {
        BigDecimal totalPrice = new BigDecimal(0);
        for(Book book : bookShop.getBooks()){
            totalPrice = totalPrice.add(book.getPrice());
        }
        return totalPrice;
    }

    @Override
    public List<Book> getBooksByAuthor(String author) throws BooksNotFoundException {
        List<Book> suitableBooks = new ArrayList<>();

        for(Map.Entry entry : bookShop.getBooksByAuthor().entrySet()){
            if(entry.getKey().equals(author))
                suitableBooks = (List<Book>) entry.getKey();
        }

        if(suitableBooks.size() == 0) throw new BooksNotFoundException("No books were found");
        else return suitableBooks;
    }
}
