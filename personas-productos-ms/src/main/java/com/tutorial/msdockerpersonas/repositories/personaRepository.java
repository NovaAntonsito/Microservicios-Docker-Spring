package com.tutorial.msdockerpersonas.repositories;


import com.tutorial.msdockerpersonas.entities.Persona;
import com.tutorial.msdockerpersonas.repositories.base.baseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends baseRepository<Persona, Long> {

    boolean existsByNombreAndDNI(String nombre, String dni);

    Persona getByID(Long id);

    boolean existsByID(Long id);

}
