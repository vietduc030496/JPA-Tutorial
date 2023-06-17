package com.vti.CDBookStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "fist_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    private String email;

    @Column(length = 2000)
    private String bio;

    private LocalDate dateOfBirth;

}
