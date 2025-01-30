package com.tutorial.msbookingservice.repositories;

import com.tutorial.msbookingservice.entities.Restaurantes;
import com.tutorial.msbookingservice.repositories.base.baseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restauranteRepository extends baseRepository<Restaurantes, Long> {
}
