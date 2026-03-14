package br.eti.aloisio.dio.accenture.booktracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.eti.aloisio.dio.accenture.booktracker.dto.BookRequestDTO;
import br.eti.aloisio.dio.accenture.booktracker.factory.BookFactory;
import br.eti.aloisio.dio.accenture.booktracker.model.Book;
import br.eti.aloisio.dio.accenture.booktracker.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book create(BookRequestDTO dto) {
        Book book = BookFactory.create(dto);
        return repository.save(book);
    }

    public List<Book> listAll() {
        return repository.findAll();
    }
}
