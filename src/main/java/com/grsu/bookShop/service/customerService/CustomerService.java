package com.grsu.bookShop.service.customerService;

import com.grsu.bookShop.model.users.Customer;

import java.math.BigDecimal;

public interface CustomerService {

    BigDecimal getCartCost(Customer customer);

}
