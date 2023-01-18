package com.hb.spring.service.impl;

import com.hb.spring.service.BookService;
import com.hb.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private BookService bookService;

    @Override
    //@Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId, bookId);
        }
    }
}
