package com.tutorial.msbookingservice.controllers;

import com.tutorial.msbookingservice.entities.Restaurantes;
import com.tutorial.msbookingservice.services.restaurantesService;
import com.tutorial.msbookingservice.controllers.base.baseControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/restaurantes")
@CrossOrigin(origins = "*")
public class restauranteController extends baseControlador<Restaurantes,restaurantesService>{

    @Autowired
    restaurantesService restaurantesService;

}
