package com.grsu.bookShop.main;

import com.grsu.bookShop.model.book.AudioBook;
import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.book.BookGenre;
import com.grsu.bookShop.model.book.PrintedBook;
import com.grsu.bookShop.model.bookShop.BookShop;
import com.grsu.bookShop.service.bookShopFacade.BookShopFacade;
import com.grsu.bookShop.service.bookShopFacade.BookShopFacadeImpl;
import com.grsu.bookShop.service.serializer.Serializer;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static BookShopFacade bookShopFacade = new BookShopFacadeImpl();

    public static void main(String args[]){
        BookShop bookShop = createBookshop();

        bookShopFacade.serializeBookShop("books.txt");
        System.out.println(bookShopFacade.deserializeBookShop("books.txt"));

        System.out.println(bookShopFacade.getTotalPriceOfBookShop());
    }

    public static BookShop createBookshop(){
        List<Book> books = new ArrayList<>() {
            {
                add(new PrintedBook("War and Peace", "Lev Tolstoy", BookGenre.CLASSIC, new BigDecimal(29.99), 5));
                add(new AudioBook("Lolita", "Vladimir Nabokov", BookGenre.CLASSIC, new BigDecimal(12.99), 22));
                add(new PrintedBook("Crime and Punishment", "Fyodor Dostoevsky", BookGenre.CLASSIC, new BigDecimal(17.00), 15));
            }
        };
        BookShop bookShop = BookShop.getInstance();
        bookShop.setBooks(books);
        return bookShop;
    }
}
