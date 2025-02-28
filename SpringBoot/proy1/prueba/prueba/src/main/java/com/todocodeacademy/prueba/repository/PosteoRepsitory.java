package com.todocodeacademy.prueba.repository;
import com.todocodeacademy.prueba.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepsitory implements IPosteoRepository{

    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> listaPosteos = new ArrayList<Posteo>();

        listaPosteos.add(new Posteo(1L, "¿Como formatear una pec", "Luisina de Paula"));
        listaPosteos.add(new Posteo(1L, "¿Como mantener la seguridad", "Gabriel Guismin"));

        return listaPosteos;
    }
}
