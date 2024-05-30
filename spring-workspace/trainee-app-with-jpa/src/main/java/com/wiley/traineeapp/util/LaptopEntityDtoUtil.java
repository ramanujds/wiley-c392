package com.wiley.traineeapp.util;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.model.Laptop;

public class LaptopEntityDtoUtil {

    public static LaptopDto toDto(com.wiley.traineeapp.model.Laptop entity) {
        return new LaptopDto(entity.getId(), entity.getBrand(), entity.getModel(), entity.getPrice());
    }

    public static Laptop toEntity(com.wiley.traineeapp.dto.LaptopDto dto) {
        Laptop entity = new Laptop();
        entity.setId(dto.id());
        entity.setBrand(dto.brand());
        entity.setModel(dto.model());
        entity.setPrice(dto.price());
        return entity;
    }
}
