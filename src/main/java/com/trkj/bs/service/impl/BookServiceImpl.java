package com.trkj.bs.service.impl;

import com.trkj.bs.entity.BookType;
import com.trkj.bs.mapper.Bookyypemapper;
import com.trkj.bs.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService {

    @Autowired
    private Bookyypemapper bookyypemapper;

    @Override
    public List<BookType> getall() {
        List<BookType> list=bookyypemapper.getall();
        return list;
    }
}
