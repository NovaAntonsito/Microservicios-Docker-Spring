package com.tutorial.msbookingservice.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Restaurantes extends Establecimiento {

    private String tipoComida;
    private String direccion;

}
