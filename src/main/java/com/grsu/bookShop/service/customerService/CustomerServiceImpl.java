package com.grsu.bookShop.service.customerService;

import com.grsu.bookShop.model.book.Book;
import com.grsu.bookShop.model.users.Customer;

import java.math.BigDecimal;

public class CustomerServiceImpl implements CustomerService {
    
    @Override
    public BigDecimal getCartCost(Customer customer) {
        BigDecimal cost = new BigDecimal(0);
        
        for(Book book : customer.getCart()){
            cost = cost.add(book.getPrice());
        }

        return cost;
    }
}
