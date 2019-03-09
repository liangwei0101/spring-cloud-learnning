package com.liangwei.book_service.controller;

import com.liangwei.book_service.model.Book;
import com.liangwei.book_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value ="/book", method = RequestMethod.GET)
    public List<Book> BookQry() {
        return bookService.getBook();
    }

    @RequestMapping(value ="/book", method = RequestMethod.POST)
    public void BookAdd(Book book){
        bookService.addBook(book);
    }

    @RequestMapping(value ="/book", method = RequestMethod.PUT)
    public void BookUpdate(Book book){
        bookService.updateBookById(book);
    }

    @RequestMapping(value ="/book", method = RequestMethod.DELETE)
    public void BookDel(@RequestParam(value="id") int id){
        bookService.delBookById(id);
    }
}
