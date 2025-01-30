package com.tutorial.msbookingservice.services.base;


import com.tutorial.msbookingservice.controllers.exceptions.ResourceNotFoundException;
import com.tutorial.msbookingservice.entities.Base.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;


public interface IBaseService  <E extends BaseEntity, ID extends Serializable>{
     List<E> findAll() throws Exception;

    //Get all Paged
     Page<E> findAllPaged(Pageable pageable) throws Exception;
    //Get One
     E findById(ID id) throws Exception;
    //Post
     E save(E entity) throws Exception;
    //Put
     E update(ID id, E entity) throws ResourceNotFoundException;
    //Delete
     boolean delete(ID id) throws Exception;

     boolean isPresent(ID id) throws Exception;

}
