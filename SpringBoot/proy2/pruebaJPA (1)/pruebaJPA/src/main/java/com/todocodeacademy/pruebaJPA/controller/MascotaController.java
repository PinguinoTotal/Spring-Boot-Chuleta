package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import com.todocodeacademy.pruebaJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascotaService;

    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
        return "mascota guardada con exito";
    }

}
