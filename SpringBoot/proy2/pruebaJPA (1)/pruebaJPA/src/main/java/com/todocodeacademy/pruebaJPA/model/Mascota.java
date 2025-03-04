package com.todocodeacademy.pruebaJPA.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @ManyToOne
    //le decimos que esta mascota (que sera parte de una lista de mascotas), tendra una persona asociada
    //haciendo la relacion bidireccional
    private Persona persona;

    public Mascota(){

    }

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String color) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
}
