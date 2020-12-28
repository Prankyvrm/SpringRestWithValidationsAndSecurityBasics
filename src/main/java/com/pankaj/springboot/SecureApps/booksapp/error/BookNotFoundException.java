package com.pankaj.springboot.SecureApps.booksapp.error;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(Long id) {
        super("Book id not found : " + id);
    }

}
