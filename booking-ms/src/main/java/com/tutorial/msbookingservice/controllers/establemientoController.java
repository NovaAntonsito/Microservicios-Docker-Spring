package com.tutorial.msbookingservice.controllers;


import com.tutorial.msbookingservice.controllers.base.baseControlador;
import com.tutorial.msbookingservice.entities.Establecimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tutorial.msbookingservice.services.establecimientoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/establecimiento")
public class establemientoController extends baseControlador<Establecimiento, establecimientoService> {

    @Autowired
    establecimientoService establecimientoService;


}
