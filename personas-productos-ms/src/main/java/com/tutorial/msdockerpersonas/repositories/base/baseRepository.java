package com.tutorial.msdockerpersonas.repositories.base;


import com.tutorial.msdockerpersonas.entities.base.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface baseRepository <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E,ID> {

}