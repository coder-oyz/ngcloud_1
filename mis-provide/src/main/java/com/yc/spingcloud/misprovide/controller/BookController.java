package com.yc.spingcloud.misprovide.controller;

import com.yc.spingcloud.misprovide.bean.Book;

import com.yc.spingcloud.misprovide.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("{id}")
    public Book getBook(@PathVariable("id")Integer id){
    return bookService.getBook(id);
    }
}
