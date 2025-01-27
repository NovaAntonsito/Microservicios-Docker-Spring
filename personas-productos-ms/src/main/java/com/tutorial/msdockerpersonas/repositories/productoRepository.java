package com.tutorial.msdockerpersonas.repositories;

import com.tutorial.msdockerpersonas.entities.Producto;
import com.tutorial.msdockerpersonas.repositories.base.baseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepository extends baseRepository<Producto, Long> {

    Producto getByID(Long id);

    boolean existsByID(Long id);

    boolean existsByNombre(String nombre);
}
