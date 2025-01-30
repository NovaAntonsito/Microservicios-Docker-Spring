package com.tutorial.msbookingservice.controllers.base;

import com.tutorial.msbookingservice.controllers.exceptions.DatabaseEmptyException;
import com.tutorial.msbookingservice.controllers.exceptions.DuplicatedDataException;
import com.tutorial.msbookingservice.controllers.exceptions.ResourceNotFoundException;
import com.tutorial.msbookingservice.entities.Base.BaseEntity;
import com.tutorial.msbookingservice.services.base.baseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("all")
public abstract class baseControlador<E extends BaseEntity, S extends baseService<E, Long>> implements IbaseControlador<E, Long> {

    @Autowired
    protected S servicio;

    @GetMapping("") //Get All
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        } catch (Exception e) {
            throw new DatabaseEmptyException("No hay registros en la base de datos");
        }
    }

    @GetMapping("/{id}") //Get One
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        } catch (Exception e) {
            throw new ResourceNotFoundException("No se encontro registro");
        }
    }

    @PostMapping(value = "", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE}) //Post
    public ResponseEntity<?> save(@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        } catch (Exception e) {
            throw new DuplicatedDataException("Ya existe un registro con la misma informacion");
        }
    }

    @PutMapping("/{id}") //Put
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        } catch (Exception e) {
            throw new ResourceNotFoundException("No se encontro registro");
        }

    }

    @DeleteMapping("/{id}") //Delete
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
        } catch (Exception e) {
            throw new ResourceNotFoundException("No se encontro registro");
        }
    }
}