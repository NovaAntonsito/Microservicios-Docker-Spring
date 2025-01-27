package com.tutorial.msdockerpersonas.controllers;


import com.tutorial.msdockerpersonas.controllers.exceptions.DatabaseEmptyException;
import com.tutorial.msdockerpersonas.controllers.exceptions.DuplicatedDataException;
import com.tutorial.msdockerpersonas.controllers.exceptions.ResourceNotFoundException;
import com.tutorial.msdockerpersonas.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tutorial.msdockerpersonas.services.productoService;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("v1/api/productos")
public class productoController {

    @Autowired
    private productoService productoService;

    @GetMapping("")
    public ResponseEntity<?> getAllproductos() throws DatabaseEmptyException {
        return ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping("/data")
    public ResponseEntity<?> getOneProducto (@RequestParam("id") Long id) throws ResourceNotFoundException {
        return ResponseEntity.ok(productoService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createProducto(@RequestBody Producto producto) throws DuplicatedDataException {
        try{
            productoService.isDuplicated(producto.getNombre());
            productoService.save(producto);
            return ResponseEntity.ok(new HashMap(){
                {
                    put("message", "Producto creado");
                }
            });


        } catch (Exception e) {
            throw new DuplicatedDataException("Ya existe un producto con ese nombre " + producto.getNombre());
        }
    }


    @PutMapping("/update")
    public ResponseEntity<?> updateProducto(@RequestParam("id") Long id, @RequestBody Producto producto) throws ResourceNotFoundException {
        if (!productoService.isPresent(id)){
            throw new ResourceNotFoundException("No se encontro registro");
        }
        productoService.update(id, producto);
        return ResponseEntity.ok(new HashMap() {
        {
            put("message", "Producto actualizado");
        }
        });

    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteProducto(@RequestParam("id") Long id) {
        if(productoService.isPresent(id)){
            productoService.delete(id);
            return ResponseEntity.ok(new HashMap(){
                {
                    put("message", "Producto eliminado");
                }
            });
        }
        throw new ResourceNotFoundException("No se encontro registro");
    }


}
