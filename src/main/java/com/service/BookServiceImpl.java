
package com.service;

import com.dao.BookDao;
import com.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Lxx on 2017/5/15.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public List listBook() {
       return bookDao.listBook();
    }
}
