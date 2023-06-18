package com.vti.CDBookStore.example.ex03;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Float duration;

    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] wav;
    private String description;

}
