package com.thesystemsmith.exceptions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/books/{id}")
    public String getBook(@PathVariable Long id) {
        // Simulate database lookup
        // Replace this with your actual data access logic
        if (id.equals(123L)) {
            throw new BookNotFoundException("BOOK_NOT_FOUND", "Book with ID " + id + " not found");
        } else {
            // Return book data
            return "Book data for ID: " + id;
        }
    }
}