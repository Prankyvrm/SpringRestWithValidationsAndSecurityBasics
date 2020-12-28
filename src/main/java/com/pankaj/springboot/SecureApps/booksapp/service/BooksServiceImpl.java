package com.pankaj.springboot.SecureApps.booksapp.service;

import com.pankaj.springboot.SecureApps.booksapp.model.Book;
import com.pankaj.springboot.SecureApps.booksapp.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksRepository  booksRepository;
    @Override
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public Book getBookById(long bookId) {
        return booksRepository.findById(bookId).get();
    }

    @Override
    public Book getBookByName(String bookName) {
        return null;
    }

    @Override
    public Book addBook(Book book) {
        return booksRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return booksRepository.save(book);
    }

    @Override
    public void deleteBook(long bookId) {
        booksRepository.deleteById(bookId);
    }
}
