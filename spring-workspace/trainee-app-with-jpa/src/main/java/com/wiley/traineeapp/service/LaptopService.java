package com.wiley.traineeapp.service;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.model.Laptop;

import java.util.List;

public interface LaptopService {

    LaptopDto saveLaptop(LaptopDto laptop);
    LaptopDto getLaptopById(int id);
    List<LaptopDto> getAllLaptops();



}
