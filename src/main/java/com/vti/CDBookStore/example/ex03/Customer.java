package com.vti.CDBookStore.example.ex03;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creationDate;
    @Transient
    private int age;


}
