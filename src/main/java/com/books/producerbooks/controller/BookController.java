package com.books.producerbooks.controller;

import com.books.producerbooks.domain.request.BookRequest;
import com.books.producerbooks.service.BookProducerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("books")
@Tag(name = "Books endpoints", description = "Books endpoints")
public class BookController {

    @Autowired
    private BookProducerService bookProducerService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Create a new Book")
    public ResponseEntity<String> createBook(@RequestBody BookRequest bookRequest) {
        bookProducerService.createBookService(bookRequest);
        return ResponseEntity.ok().body("Book sent to creation queue");
    }

}
