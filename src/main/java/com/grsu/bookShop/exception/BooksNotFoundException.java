package com.grsu.bookShop.exception;

import java.util.function.Supplier;

public class BooksNotFoundException extends RuntimeException{
    public BooksNotFoundException() {
    }

    public BooksNotFoundException(String message){
        super(message);
    }
}
