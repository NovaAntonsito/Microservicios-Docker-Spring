package com.tutorial.msdockerpersonas.services;

import com.tutorial.msdockerpersonas.controllers.exceptions.DuplicatedDataException;
import com.tutorial.msdockerpersonas.entities.Persona;

public interface IPersonaService {



    boolean isDuplicated(Persona persona) throws DuplicatedDataException;
}
