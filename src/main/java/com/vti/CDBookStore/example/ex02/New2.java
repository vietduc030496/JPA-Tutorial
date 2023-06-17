package com.vti.CDBookStore.example.ex02;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_new2")
@Getter
@Setter
public class New2 {

    @Id
    private Long id;

    @Id
    private String language;

    private String content;
}
