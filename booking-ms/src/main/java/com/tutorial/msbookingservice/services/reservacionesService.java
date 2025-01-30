package com.tutorial.msbookingservice.services;

import com.tutorial.msbookingservice.entities.Reservaciones;
import com.tutorial.msbookingservice.repositories.base.baseRepository;
import com.tutorial.msbookingservice.services.base.baseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class reservacionesService extends baseService<Reservaciones, Long> {
    public reservacionesService(baseRepository<Reservaciones, Long> BaseRepository) {
        super(BaseRepository);
    }
}
