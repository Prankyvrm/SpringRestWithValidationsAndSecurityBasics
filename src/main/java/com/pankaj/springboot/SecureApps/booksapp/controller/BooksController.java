package com.pankaj.springboot.SecureApps.booksapp.controller;

import com.pankaj.springboot.SecureApps.booksapp.error.BookNotFoundException;
import com.pankaj.springboot.SecureApps.booksapp.model.Book;
import com.pankaj.springboot.SecureApps.booksapp.repository.BooksRepository;
import com.pankaj.springboot.SecureApps.booksapp.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@Validated
public class BooksController {
    @Autowired
    private BooksService booksService;
    @Autowired

    private BooksRepository booksRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return booksService.getAllBooks();
    }
    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable(name="bookId") long bookId) {
        return booksRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));
    }

    /*public Book getBookByName(String bookName) {
        return null;
    }*/

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@Valid  @RequestBody Book book) {
        return booksService.addBook(book);
    }
    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable @Min(1) long bookId, @Valid  @RequestBody Book book) {
        Book bookTobeUpdated = booksService.getBookById(bookId);
        if(bookTobeUpdated==null){
            throw new BookNotFoundException(bookId);
        }
        return booksService.updateBook(book);
    }
    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable  long bookId) {
        Book bookTobeUpdated = booksService.getBookById(bookId);
        if(bookTobeUpdated==null){
            throw new BookNotFoundException(bookId);
        }
        booksService.deleteBook(bookId);
    }
}
