package com.tutorial.msdockerpersonas.services;

import com.tutorial.msdockerpersonas.controllers.exceptions.DuplicatedDataException;
import com.tutorial.msdockerpersonas.entities.Producto;
import com.tutorial.msdockerpersonas.repositories.base.baseRepository;
import com.tutorial.msdockerpersonas.services.Base.baseService;
import org.springframework.stereotype.Service;
import com.tutorial.msdockerpersonas.repositories.productoRepository;


@Service
public class productoService extends baseService<Producto, Long> implements IProductoService {

    private final productoRepository productoRepository;

    public productoService(baseRepository<Producto, Long> baseRepository, productoRepository productoRepository) {
        super(baseRepository);
        this.productoRepository = productoRepository;
    }


    @Override
    public boolean isDuplicated(String nombre) throws DuplicatedDataException {
        if(productoRepository.existsByNombre(nombre)){
            throw new DuplicatedDataException("Ya existe un producto con ese nombre " + nombre);
        }
        return false;
    }
}
