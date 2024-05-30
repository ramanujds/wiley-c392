package com.wiley.traineeapp.service;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.model.Laptop;
import com.wiley.traineeapp.repository.LaptopRepository;
import com.wiley.traineeapp.util.LaptopEntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    @Autowired
    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public LaptopDto saveLaptop(LaptopDto laptop) {
        Laptop savedLaptop = laptopRepository.save(LaptopEntityDtoUtil.toEntity(laptop));
        return LaptopEntityDtoUtil.toDto(savedLaptop);
    }

    public LaptopDto getLaptopById(int id) {
        return laptopRepository.findById(id).map(LaptopEntityDtoUtil::toDto).orElse(null);
    }

    public List<LaptopDto> getAllLaptops() {
        return laptopRepository.findAll().parallelStream().map(LaptopEntityDtoUtil::toDto)
                .toList();
    }
}
