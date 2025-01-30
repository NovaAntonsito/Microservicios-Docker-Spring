package com.tutorial.msbookingservice.entities;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hoteles extends Establecimiento {

    private int estrellas;
    private String direccion;
}
