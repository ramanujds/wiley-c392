package com.wiley.traineeapp.util;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.model.Trainee;

public class TraineeEntityDtoUtil {

    public static TraineeDto convertToDto(Trainee trainee) {
        LaptopDto laptopDto = trainee.getLaptop() != null ? LaptopEntityDtoUtil.toDto(trainee.getLaptop()) : null;
        return new TraineeDto(trainee.getId(), trainee.getName(), trainee.getEmail(), trainee.getLocation(), trainee.getJoinDate(),
                laptopDto);
    }

    public static Trainee convertToEntity(TraineeDto traineeDto) {
        Trainee trainee = new Trainee();
        trainee.setId(traineeDto.id());
        trainee.setName(traineeDto.name());
        trainee.setEmail(traineeDto.email());
        trainee.setLocation(traineeDto.location());
        trainee.setJoinDate(traineeDto.joinDate());
        if(traineeDto.laptop()!=null)trainee.setLaptop(LaptopEntityDtoUtil.toEntity(traineeDto.laptop()));
        return trainee;
    }

}
