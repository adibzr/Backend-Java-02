package com.soyhenry.ej11.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends RepresentationModel<Movie> {

    private Long id;
    private String name;
    private String description;
    private Integer yearOfRelease;
}
