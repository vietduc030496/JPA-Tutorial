package com.vti.CDBookStore.example.ex02;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_new")
@Getter
@Setter
public class New {

    @EmbeddedId
    private NewsId id;
    private String content;
}
