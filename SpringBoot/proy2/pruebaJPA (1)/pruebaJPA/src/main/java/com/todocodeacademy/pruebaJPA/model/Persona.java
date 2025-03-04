package com.todocodeacademy.pruebaJPA.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    //y tambien es importante recalcar que se hace atraves de una lista
    //esto nos genera una tabla extra (si no le ponemos el many to one en la otra parte de la relacion )
    @OneToMany
    private List<Mascota> listaMascotas;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
