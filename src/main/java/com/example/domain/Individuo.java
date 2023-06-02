package com.example.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


import java.io.Serializable;

@Data
@Entity
@Table(name = "individuo")
public class Individuo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo;

    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String edad;

    @NotEmpty
    @Email
    private String correo;
    @NotEmpty
    private String telefono;



}
