package com.tutorial.msbookingservice.services;

import com.tutorial.msbookingservice.entities.Establecimiento;
import com.tutorial.msbookingservice.repositories.base.baseRepository;
import com.tutorial.msbookingservice.services.base.baseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class establecimientoService extends baseService<Establecimiento, Long> {
    public establecimientoService(baseRepository<Establecimiento, Long> BaseRepository) {
        super(BaseRepository);
    }
}
