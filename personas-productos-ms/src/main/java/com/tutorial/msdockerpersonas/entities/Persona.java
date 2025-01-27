package com.tutorial.msdockerpersonas.entities;

import com.tutorial.msdockerpersonas.entities.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "personas")
@Getter
@Setter
@NoArgsConstructor
public class Persona extends BaseEntity {

    private String nombre;
    private Long edad;
    private String direccion;
    private String telefono;
    @Column(unique = true)
    private String DNI;


}
