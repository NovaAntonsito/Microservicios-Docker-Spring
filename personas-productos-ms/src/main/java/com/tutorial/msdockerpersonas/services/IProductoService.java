package com.tutorial.msdockerpersonas.services;


import com.tutorial.msdockerpersonas.controllers.exceptions.DuplicatedDataException;

public interface IProductoService  {

    boolean isDuplicated(String nombre) throws DuplicatedDataException;
}
