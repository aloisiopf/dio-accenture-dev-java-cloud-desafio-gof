package br.eti.aloisio.dio.accenture.booktracker.dto;

import lombok.Data;

@Data
public class BookRequestDTO {
    private String title;
    private String author;
    private String status;
    private Integer rating;
}
