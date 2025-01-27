package com.tutorial.msdockerpersonas.controllers;


import com.tutorial.msdockerpersonas.controllers.exceptions.DatabaseEmptyException;
import com.tutorial.msdockerpersonas.controllers.exceptions.DuplicatedDataException;
import com.tutorial.msdockerpersonas.controllers.exceptions.ResourceNotFoundException;
import com.tutorial.msdockerpersonas.entities.Persona;
import com.tutorial.msdockerpersonas.services.personaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Slf4j
@RestController
@RequestMapping("v1/api/persona")
public class personaController {

    @Autowired
    private personaService personaService;


    @GetMapping("/all")
    public ResponseEntity<?> getAllPersonas() {
        if (personaService.findAll().isEmpty()) {
            throw new DatabaseEmptyException("No hay registros en la base de datos");
        }
        return ResponseEntity.ok(personaService.findAll());
    }

    @GetMapping("/data")
    public ResponseEntity<?> getPersonaByID(@RequestParam(value = "id") Long id) {
        if (!personaService.isPresent(id)) {
            throw new ResourceNotFoundException("No se encontro registro");
        }
        return ResponseEntity.ok(personaService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createPersona(@RequestBody Persona persona) throws Exception {
        try {
            personaService.isDuplicated(persona);
            personaService.save(persona);
        } catch (DuplicatedDataException e) {
            throw new DuplicatedDataException("Ya existe una persona con ese documento " + persona.getDNI());
        }
        return ResponseEntity.ok(new HashMap() {
            {
                put("message", "Persona creada");
            }
        });
    }

    @PutMapping("/update")
    public ResponseEntity<?> updatePersona (@RequestBody Persona persona, @RequestParam(value = "id") Long id) throws ResourceNotFoundException {
        if (!personaService.isPresent(id)) {
            throw new ResourceNotFoundException("No se encontro registro");
        }
        personaService.update(id, persona);
        return ResponseEntity.ok(new HashMap() {
            {
                put("message", "Persona actualizada");
            }
        });
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam Long id) throws ResourceNotFoundException {
        if(!personaService.isPresent(id)){
            throw new ResourceNotFoundException("No se encontro el registro");
        }
        personaService.delete(id);
        return ResponseEntity.ok(new HashMap() {
            {
                put("message", "Persona eliminada");
            }
        });

    }


}

