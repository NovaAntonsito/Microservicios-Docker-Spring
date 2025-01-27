package com.tutorial.msdockerpersonas.controllers.exceptions.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {

    private Date date;
    private String message;
    private String details;
}
