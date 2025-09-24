package com.pragma.powerup.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PersonModel {

    private Long id;
    private String nombre;
    private String apellido;
    private String documentoDeIdentidad;
    private String correo;

}
