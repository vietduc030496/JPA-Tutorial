package com.vti.CDBookStore.example.ex05;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address2 {

    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipcode;
    private String country;
}
