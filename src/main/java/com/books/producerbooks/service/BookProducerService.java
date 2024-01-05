package com.books.producerbooks.service;

import com.books.producerbooks.domain.request.BookRequest;

public interface BookProducerService {

    void createBookService(BookRequest bookRequest);
}
