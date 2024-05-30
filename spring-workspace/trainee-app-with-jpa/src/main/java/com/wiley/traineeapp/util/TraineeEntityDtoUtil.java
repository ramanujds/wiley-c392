package com.wiley.traineeapp.util;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.model.Laptop;
import com.wiley.traineeapp.model.Trainee;

import java.util.List;

public class TraineeEntityDtoUtil {

    public static TraineeDto convertToDto(Trainee trainee) {
        List<LaptopDto> laptopDtos = null;
        if (trainee.getLaptops() != null)
            laptopDtos = trainee.getLaptops().parallelStream().map(LaptopEntityDtoUtil::toDto).toList();
        return new TraineeDto(trainee.getId(), trainee.getName(), trainee.getEmail(), trainee.getLocation(), trainee.getJoinDate(), laptopDtos);

    }

    public static Trainee convertToEntity(TraineeDto traineeDto) {
        Trainee trainee = new Trainee();
        trainee.setId(traineeDto.id());
        trainee.setName(traineeDto.name());
        trainee.setEmail(traineeDto.email());
        trainee.setLocation(traineeDto.location());
        trainee.setJoinDate(traineeDto.joinDate());
        if (traineeDto.laptops() == null) {
            return trainee;
        }
        List<Laptop> laptops = traineeDto.laptops().parallelStream().map(LaptopEntityDtoUtil::toEntity).toList();
        trainee.setLaptops(laptops);
        return trainee;
    }

}
