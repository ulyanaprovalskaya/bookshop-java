package com.grsu.bookShop.model.book;

import java.math.BigDecimal;

public class AudioBook extends Book {

    private int timeToListen;

    public int getTimeToListen() {
        return timeToListen;
    }

    public void setTimeToListen(int timeToListen) {
        this.timeToListen = timeToListen;
    }

    public AudioBook() {
        super();
    }

    public AudioBook(String title, String author, BookGenre genre, BigDecimal price, int timeToListen) {
        super(title, author, genre, price);
        this.timeToListen = timeToListen;
    }
}
