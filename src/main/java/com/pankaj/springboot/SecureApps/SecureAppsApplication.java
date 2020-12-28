package com.pankaj.springboot.SecureApps;

import com.pankaj.springboot.SecureApps.booksapp.model.Book;
import com.pankaj.springboot.SecureApps.booksapp.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class SecureAppsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureAppsApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(BooksRepository repository) {
        return args -> {
            repository.save(new Book("Java Development", "Pankaj", new BigDecimal("15.41")));
            repository.save(new Book("HR Development", "Sheetal", new BigDecimal("50.55")));
            repository.save(new Book("Python Development", "Sumit", new BigDecimal("9.69")));
            repository.save(new Book("Testing Development", "Sheetal", new BigDecimal("47.99")));
        };
    }

}
