package com.liangwei.book_service.service;

import com.liangwei.book_service.model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);

    void delBookById(int id);

    void updateBookById(Book book);

    List<Book> getBook();
}

