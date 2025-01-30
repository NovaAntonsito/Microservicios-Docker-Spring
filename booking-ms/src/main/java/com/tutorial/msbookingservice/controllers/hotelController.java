package com.tutorial.msbookingservice.controllers;

import com.tutorial.msbookingservice.controllers.base.baseControlador;
import com.tutorial.msbookingservice.entities.Hoteles;

import com.tutorial.msbookingservice.services.hotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/hotel")
public class hotelController extends baseControlador<Hoteles, hotelService> {

    @Autowired
    hotelService hotelService;

}
