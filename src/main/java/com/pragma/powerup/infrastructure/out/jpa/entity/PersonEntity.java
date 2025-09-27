package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class PersonEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "usuario_id", nullable = false)
    private Long id;

    @Column(name = "nombre", length = 220)
    private String nombre;

    @Column(name = "apellido", length = 220)
    private String apellido;

    @Column(name="documento_de_identidad",  unique = true)
    private String documentoDeIdentidad;

    @Column(name="correo", unique = true)
    private String correo;
}
