package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public void saveMascota(Mascota masco);

    public void deleteMascota(Long id_mascota);

    public Mascota findMAscota(Long id_mascota);

    public  void editMascota(Long idOriginal, Long id_mascotaNueva,
                             String nuevoNombre,
                             String nuevaEspecie,
                             String nuevaRaza,
                             String nuevoColor);
}
