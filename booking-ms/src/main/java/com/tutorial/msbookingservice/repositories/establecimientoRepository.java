package com.tutorial.msbookingservice.repositories;

import com.tutorial.msbookingservice.entities.Establecimiento;
import com.tutorial.msbookingservice.repositories.base.baseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface establecimientoRepository extends baseRepository<Establecimiento, Long> {
}
