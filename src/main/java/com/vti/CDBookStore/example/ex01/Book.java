package com.vti.CDBookStore.example.ex01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_book")
@Getter
@Setter
public class Book {

    @Id
    private Long id;
    private String title;
    private Float price;
    private String description;
    private String isbn;
    private Integer nbOfPages;
    private Boolean illustrations;
}
