package com.todocodeacademy.prueba.entitys;


//Esta sera la clase DTO de propeidad, por ende tendra los valores de la propiedad, pero a la vez
//tambien tendra informacion extra, ya que al ser un dto es la que junta esta informacion

import lombok.Getter;
import lombok.Setter;

//sera una mezcla entre propiedad e inquilino
@Getter
@Setter
public class PropiedadDTO {

    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double valor_alquiler;
    private String nombre;
    private String apellido;

    public PropiedadDTO() {
    }

    public PropiedadDTO(Long id_propiedad, String tipo_propiedad, String direccion, Double valor_alquiler, String nombre, String apellido) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.valor_alquiler = valor_alquiler;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
