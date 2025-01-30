package com.tutorial.msbookingservice.services;

import com.tutorial.msbookingservice.entities.Restaurantes;
import com.tutorial.msbookingservice.repositories.base.baseRepository;
import com.tutorial.msbookingservice.services.base.baseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class restaurantesService extends baseService<Restaurantes, Long> {
    public restaurantesService(baseRepository<Restaurantes, Long> BaseRepository) {
        super(BaseRepository);
    }
}
