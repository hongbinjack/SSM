package com.hb.spring.controller;

import com.hb.spring.service.BookService;
import com.hb.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId, Integer bookId){
        bookService.buyBook(userId, bookId);
    }

    public void checkout(Integer userId, Integer[] bookIds){
        checkoutService.checkout(userId, bookIds);
    }
}
