package com.liangwei.book_service.service.Impl;

import com.liangwei.book_service.mapper.BookMapper;
import com.liangwei.book_service.model.Book;
import com.liangwei.book_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void delBookById(int id) {
        bookMapper.delBookById(id);
    }

    @Override
    public void updateBookById(Book book) {
        bookMapper.updateBookById(book.getName(),book.getPrice(),book.getId());
    }

    @Override
    public List<Book> getBook() {
        return bookMapper.getBook();
    }
}
