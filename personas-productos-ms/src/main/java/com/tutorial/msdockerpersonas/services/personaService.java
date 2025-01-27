package com.tutorial.msdockerpersonas.services;


import com.tutorial.msdockerpersonas.controllers.exceptions.DuplicatedDataException;
import com.tutorial.msdockerpersonas.entities.Persona;
import com.tutorial.msdockerpersonas.repositories.base.baseRepository;
import com.tutorial.msdockerpersonas.services.Base.baseService;
import com.tutorial.msdockerpersonas.repositories.personaRepository;
import org.springframework.stereotype.Service;

@Service
public class personaService extends baseService<Persona, Long> implements IPersonaService {


    private final personaRepository personaRepository;

    public personaService(baseRepository<Persona, Long> baseRepository, personaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;

    }

    @Override
    public boolean isDuplicated(Persona persona) throws DuplicatedDataException {
        if (personaRepository.existsByNombreAndDNI(persona.getNombre(), persona.getDNI())) {
            throw new DuplicatedDataException("Ya existe una persona con ese documento " + persona.getDNI());
        }
        return false;
    }


}
