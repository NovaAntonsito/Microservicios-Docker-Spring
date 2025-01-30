package com.tutorial.msbookingservice.entities;

import com.tutorial.msbookingservice.entities.Base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
public class Establecimiento extends BaseEntity {
    private String nombre;
}
