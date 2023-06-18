package com.vti.CDBookStore.example.ex04;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Entity
@Getter
@Setter
public class CD {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Float price;
    private String description;
    @Lob
    private byte[] cover;
    @ElementCollection
    @CollectionTable(name = "track_map")
    @MapKeyColumn(name = "position")
    @Column(name = "track_title")
    private Map<Integer, String> tracks = new HashMap<>();
}
