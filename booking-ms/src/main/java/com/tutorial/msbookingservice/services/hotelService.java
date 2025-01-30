package com.tutorial.msbookingservice.services;

import com.tutorial.msbookingservice.entities.Hoteles;
import com.tutorial.msbookingservice.repositories.base.baseRepository;
import com.tutorial.msbookingservice.services.base.baseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class hotelService extends baseService<Hoteles, Long> {
    public hotelService(baseRepository<Hoteles, Long> BaseRepository) {
        super(BaseRepository);
    }
}
