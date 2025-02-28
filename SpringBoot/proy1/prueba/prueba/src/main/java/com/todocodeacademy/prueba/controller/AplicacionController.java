package com.todocodeacademy.prueba.controller;

import com.todocodeacademy.prueba.model.Posteo;
import com.todocodeacademy.prueba.repository.IPosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AplicacionController {

    @Autowired
    //llamamaos a la interfaz para que llame a la clase que la implementa
    IPosteoRepository repo;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos(){
        return  repo.traerTodos();
    }

}
