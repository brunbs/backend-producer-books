package com.books.producerbooks.domain.dto;

import com.books.producerbooks.domain.request.BookRequest;
import lombok.Data;

@Data
public class BookDto {

    private String title;
    private String author;
    private String genre;

    public BookDto(BookRequest bookRequest) {
        this.title = bookRequest.getTitle();
        this.author = bookRequest.getAuthor();
        this.genre = bookRequest.getGenre();
    }

}
