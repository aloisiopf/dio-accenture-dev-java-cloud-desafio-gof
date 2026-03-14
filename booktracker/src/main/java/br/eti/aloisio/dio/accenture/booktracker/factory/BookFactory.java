package br.eti.aloisio.dio.accenture.booktracker.factory;

import br.eti.aloisio.dio.accenture.booktracker.dto.BookRequestDTO;
import br.eti.aloisio.dio.accenture.booktracker.model.Book;
import br.eti.aloisio.dio.accenture.booktracker.model.BookStatus;

public class BookFactory {
    public static Book create(BookRequestDTO dto) {
        return Book.builder()
            .title(dto.getTitle())
            .author(dto.getAuthor())
            .status(BookStatus.valueOf(dto.getStatus()))
            .rating(dto.getRating())
            .build();
    }
}
