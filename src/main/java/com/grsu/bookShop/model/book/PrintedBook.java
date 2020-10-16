package com.grsu.bookShop.model.book;

import java.math.BigDecimal;

public class PrintedBook extends Book {

    private int availableInstancesAmount;

    public int getAvailableInstancesAmount() {
        return availableInstancesAmount;
    }

    public void setAvailableInstancesAmount(int availableInstancesAmount) {
        this.availableInstancesAmount = availableInstancesAmount;
    }

    public PrintedBook() {
        super();
    }

    public PrintedBook(String title, String author, BookGenre genre, BigDecimal price, int availableInstancesAmount) {
        super(title, author, genre, price);
        this.availableInstancesAmount = availableInstancesAmount;
    }
}
