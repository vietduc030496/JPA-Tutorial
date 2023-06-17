package com.vti.CDBookStore.example.ex02;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NewsId implements Serializable {

    private Long id;
    private String language;
}
