package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter

public class PersonRequestDto {

    @NotBlank(message = "El nombre es requerido")
    @Size(min = 2, message = "El nombre debe tener al menos 2 caracteres")
    private String nombre;

    @NotBlank(message = "El apellido es requerido")
    @Size(min = 2, message = "El apellido debe tener al menos 2 caracteres")
    private String apellido;

    @NotBlank(message = "El Documento de Identidad es requerido")
    @Pattern(regexp = "\\d+", message = "El documento de identidad debe ser numérico")
    @Size(min = 5, message = "El Documento de Identidad debe tener al menos 5 caracteres")
    private String documentoDeIdentidad;

    @NotBlank(message = "El correo es requerido")
    @Email(message = "El correo electrónico debe ser válido")
    private String correo;
}
