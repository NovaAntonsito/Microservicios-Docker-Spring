package com.tutorial.msbookingservice.repositories;

import com.tutorial.msbookingservice.entities.Hoteles;
import com.tutorial.msbookingservice.repositories.base.baseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hotelRepository extends baseRepository<Hoteles, Long> {
}
