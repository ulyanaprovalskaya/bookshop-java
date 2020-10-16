package com.grsu.bookShop.model.users;

import com.grsu.bookShop.model.book.Book;

public abstract class User {
    String login;
    String email;
    String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {

    }

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public abstract void addBook(Book book);

    public abstract void deleteBook(Book book);

}
