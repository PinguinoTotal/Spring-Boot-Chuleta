package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Persona;

import java.util.List;

public interface IPersonaService {

    //traer todas las personas
    public List<Persona> getPersonas();

    //guardar una persona
    public void savePersona(Persona persona);

    //eliminar persona
    public void deletePersona(Long id);

    //encontrar una sola persona
    public Persona findPersona(Long id);

    //modificar un registro de la manera más agresiva
    public void editPersona(Long idOriginal, Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);
}
