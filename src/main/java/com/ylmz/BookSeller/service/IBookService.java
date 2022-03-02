package com.ylmz.BookSeller.service;

import com.ylmz.BookSeller.Model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
