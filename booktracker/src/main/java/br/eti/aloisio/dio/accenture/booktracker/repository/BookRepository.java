package br.eti.aloisio.dio.accenture.booktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eti.aloisio.dio.accenture.booktracker.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
