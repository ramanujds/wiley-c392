package com.wiley.traineeapp.util;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.model.Laptop;

public class LaptopEntityDtoUtil {

    public static LaptopDto toDto(Laptop entity) {
        TraineeDto traineeDto = null;
//        if (entity.getTrainee()!=null) {
//            traineeDto = TraineeEntityDtoUtil.convertToDto(entity.getTrainee());
//        }
        return new LaptopDto(entity.getId(), entity.getBrand(), entity.getModel(), entity.getPrice());
    }

    public static Laptop toEntity(LaptopDto dto) {
        Laptop entity = new Laptop();
        entity.setId(dto.id());
        entity.setBrand(dto.brand());
        entity.setModel(dto.model());
        entity.setPrice(dto.price());
//        if (dto.trainee()!=null)
//            entity.setTrainee(TraineeEntityDtoUtil.convertToEntity(dto.trainee()));
        return entity;
    }
}
