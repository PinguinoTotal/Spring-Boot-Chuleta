package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.model.Persona;
import com.todocodeacademy.pruebaJPA.service.IPersonaService;
import com.todocodeacademy.pruebaJPA.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    IPersonaService personaService;

    //obtener todas las personas
    @GetMapping("/persona/traer")
    public List<Persona> findAllPersonas(){
        return personaService.getPersonas();
    }

    //creando una persona
    @PostMapping("/persona/crear")
    public String savePersona(@RequestBody Persona perso){
        System.out.println("entrando al post");
        personaService.savePersona(perso);
        return "Persona creada con exito";
    }

    //eliminar persona
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "Persona eliminada con exito";
    }

    //obtener una sola persona
    @GetMapping("/{id}")
    public Persona findPersona(@PathVariable Long id){
        return personaService.findPersona(id);
    }

    //editando una persona
    @PutMapping("/persona/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               //aqui especificamos que no es necesario introducir todos los valores
                               @RequestParam(required = false, name="id") Long nuevaId,
                               @RequestParam(required = false, name="nombre") String nuevoNombre,
                               @RequestParam(required = false, name="apellido") String nuevoApellido,
                               @RequestParam(required = false, name="edad") int nuevaEdad){

        personaService.editPersona(id_original,nuevaId,nuevoNombre,nuevoApellido,nuevaEdad);

        Persona persona = personaService.findPersona(nuevaId);

        return persona;
    }
}
