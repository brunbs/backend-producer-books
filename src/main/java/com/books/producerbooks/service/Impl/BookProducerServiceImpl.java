package com.books.producerbooks.service.Impl;

import com.books.producerbooks.domain.dto.BookDto;
import com.books.producerbooks.domain.exception.KafkaException;
import com.books.producerbooks.domain.request.BookRequest;
import com.books.producerbooks.service.BookProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.books.producerbooks.util.ConstantUtils.KAFKA_COMMUNICATION_ERROR;

@Service
public class BookProducerServiceImpl implements BookProducerService {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public BookProducerServiceImpl (KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void createBookService(BookRequest bookRequest) {
        BookDto bookToCreate = new BookDto(bookRequest);
        sendCreateBookToKafka(bookToCreate);
    }

    private void sendCreateBookToKafka(BookDto bookDto) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String message = mapper.writeValueAsString(bookDto);
            kafkaTemplate.send("kafka-register-book-topic", message);
        } catch (Exception e) {
            throw new KafkaException(HttpStatus.INTERNAL_SERVER_ERROR, KAFKA_COMMUNICATION_ERROR, e.getCause());
        }
    }
}
