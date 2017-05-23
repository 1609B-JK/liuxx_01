package com.controller;

import com.pojo.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by Lxx on 2017/5/15.
 */
@Controller
public class BookControllor {
    @Autowired
    private BookService bookService;

    @RequestMapping("listBook")
    public ModelAndView listBook(ModelAndView mv){
        List list = bookService.listBook();
        mv.addObject("list",list);
        mv.setViewName("book/list");
        return mv;
    }


}
