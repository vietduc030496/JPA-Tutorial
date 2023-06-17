package com.vti.CDBookStore.example.ex01;

import jakarta.persistence.*;

@Entity
@Table(name = "t_address")
@SecondaryTables(value = {@SecondaryTable(name = "t_city", pkJoinColumns = @PrimaryKeyJoinColumn(name = "city_id")),
        @SecondaryTable(name = "t_country", pkJoinColumns = @PrimaryKeyJoinColumn(name = "country_id"))})
public class Address {

    @Id
    private Long id;
    private String street1;
    private String street2;
    @Column(table = "t_city")
    private String city;
    @Column(table = "t_city")
    private String state;
    @Column(table = "t_city")
    private String zipcode;
    @Column(table = "t_country")
    private String country;
}
