package com.trkj.bs.controller;

import com.trkj.bs.entity.BookType;
import com.trkj.bs.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/get")
    public List<BookType> getall(){
        List<BookType> list=bookService.getall();
        return list;
    }
}
