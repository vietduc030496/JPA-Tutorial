package com.vti.CDBookStore.example.ex03;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Book2 {

    @Id
    private Long id;

    @Column(name = "book_title", nullable = false, updatable = false)
    private String title;

    private Float price;

    @Column(length = 2000)
    private String description;

    private String isbn;

    @Column(name = "nb_of_pages", nullable = false)
    private Integer nbOfPages;

    private Boolean illustrations;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "Tag")
    @Column(name = "Value")
    private List<String> tags = new ArrayList<>();
}
