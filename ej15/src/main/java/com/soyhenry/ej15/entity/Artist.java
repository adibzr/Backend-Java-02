package com.soyhenry.ej15.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String area;
    private String bio;

    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Masterpiece> masterpieceList;
}
