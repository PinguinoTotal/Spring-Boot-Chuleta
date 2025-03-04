package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import com.todocodeacademy.pruebaJPA.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascotaRepository.save(masco);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascotaRepository.deleteById(id_mascota);
    }

    @Override
    public Mascota findMAscota(Long id_mascota) {
        return mascotaRepository.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota masco = this.findMAscota(idOriginal);
        if (masco!=null) {
            masco.setId_mascota(id_mascotaNueva);
            masco.setNombre(nuevoNombre);
            masco.setEspecie(nuevaEspecie);
            masco.setRaza(nuevaRaza);
            masco.setColor(nuevoColor);
        }

        this.saveMascota(masco);
    }
}
