package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Persona;

import java.util.List;

public interface IPersonaService {


    public List<Persona> getPersonas();


    public void savePersona(Persona persona);


    public void deletePersona(Long id);


    public Persona findPersona(Long id);


    public void editPersona(Long idOriginal, Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);
}
