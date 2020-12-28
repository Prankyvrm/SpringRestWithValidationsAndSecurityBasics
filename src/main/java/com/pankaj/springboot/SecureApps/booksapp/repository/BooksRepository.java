package com.pankaj.springboot.SecureApps.booksapp.repository;

import com.pankaj.springboot.SecureApps.booksapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
