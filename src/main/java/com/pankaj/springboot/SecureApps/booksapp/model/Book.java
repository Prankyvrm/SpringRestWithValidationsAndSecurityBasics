package com.pankaj.springboot.SecureApps.booksapp.model;

import com.pankaj.springboot.SecureApps.booksapp.error.Author;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private long bookId;

    @NotBlank(message = "Book Name cannot be blank")
    private String bookName;

    @NotBlank(message = "Author Name cannot be blank")
    @Author(message = "Author is not a valid one")
    private String authorName;
    @DecimalMin(value = "1.0", message = "Minimum Price should be greater than 0.1")
    private BigDecimal price;

    public Book() {
    }

    public Book( String bookName, String authorName, BigDecimal price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
