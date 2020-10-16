package com.grsu.bookShop.model.book;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Book implements Serializable {
    String title;
    String author;
    BookGenre genre;
    BigDecimal price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Book() {

    }

    public Book(String title, String author, BookGenre genre, BigDecimal price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\"" + title + "\" "
                + author + ", price: "
                + price + '\n';
    }
}
