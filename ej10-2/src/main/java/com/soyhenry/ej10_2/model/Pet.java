package com.soyhenry.ej10_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet extends RepresentationModel<Pet> {
    private Long id;
    private String especie;
        private String nombre;


}
