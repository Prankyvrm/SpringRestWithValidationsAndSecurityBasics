package com.pankaj.springboot.SecureApps.booksapp.service;

import com.pankaj.springboot.SecureApps.booksapp.model.Book;

import java.util.List;


public interface BooksService {

    public List<Book> getAllBooks();
    public Book getBookById(long bookId);
    public Book getBookByName(String bookName);
    public Book addBook(Book book);
    public Book updateBook(Book book);
    public void deleteBook(long bookId);


}
