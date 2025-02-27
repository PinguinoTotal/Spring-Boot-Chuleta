package com.todocodeacademy.prueba.controller;

import com.todocodeacademy.prueba.entitys.Inquilino;
import com.todocodeacademy.prueba.entitys.Propiedad;
import com.todocodeacademy.prueba.entitys.PropiedadDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HellowController {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        //que a traves de la id buscamos la propiedad
        //trajimos al inquilino asociado a esa propiedad

        //esto es la simulacion de un objeto propiedad que nos trae la base de datos
        Propiedad prop = new Propiedad(15487L, "Casa", "308 Negro Arroyo Lane", 2000.0, 40000.0 );

        Inquilino inqui = new Inquilino(1L, "12345678", "Walter", "White", "Profesor de quimica");

        PropiedadDTO propiDTO = new PropiedadDTO();

        //asignamos los datoq ue necesitamos de propiedad
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        //asignamos los datos que necesitamos de inquilino
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());

        return propiDTO;
    }
}
