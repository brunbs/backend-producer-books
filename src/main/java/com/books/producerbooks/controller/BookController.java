package com.books.producerbooks.controller;

import com.books.producerbooks.domain.request.BookRequest;
import com.books.producerbooks.service.BookProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookProducerService bookProducerService;

    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody BookRequest bookRequest) {
        bookProducerService.createBookService(bookRequest);
        return ResponseEntity.ok().body("Book sent to creation queue");
    }

}
