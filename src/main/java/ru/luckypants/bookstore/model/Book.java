package ru.luckypants.bookstore.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // уникальный номер

    @Column(name = "BOOK_TITLE")
    private String title; // название книги
    @Column(name = "BOOK_AUTHOR")
    private String author; // автор книги
    @Column(name = "BOOK_PRICE")
    private double price; // цена книги

}
