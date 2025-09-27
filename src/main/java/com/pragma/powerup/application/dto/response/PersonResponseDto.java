package com.pragma.powerup.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PersonResponseDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String documentoDeIdentidad;
    private String correo;

}
