package com.tutorial.msdockerpersonas.entities;

import com.tutorial.msdockerpersonas.entities.base.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Producto extends BaseEntity {

    private String nombre;
    private String descripcion;
    private Double precio;
    private String moneda;
}
