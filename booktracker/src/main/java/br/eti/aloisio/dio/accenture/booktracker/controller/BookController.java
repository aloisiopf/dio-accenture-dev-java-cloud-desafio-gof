package br.eti.aloisio.dio.accenture.booktracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eti.aloisio.dio.accenture.booktracker.dto.BookRequestDTO;
import br.eti.aloisio.dio.accenture.booktracker.model.Book;
import br.eti.aloisio.dio.accenture.booktracker.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book create(@RequestBody BookRequestDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<Book> listAll () {
        return service.listAll();
    }
}
