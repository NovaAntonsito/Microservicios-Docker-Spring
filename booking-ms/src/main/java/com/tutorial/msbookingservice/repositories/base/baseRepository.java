package com.tutorial.msbookingservice.repositories.base;



import com.tutorial.msbookingservice.entities.Base.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface baseRepository<E extends BaseEntity, ID extends Serializable> extends JpaRepository<E,ID> {

}