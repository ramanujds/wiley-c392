package com.wiley.traineeapp.util;

import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.model.Trainee;

public class TraineeEntityDtoUtil {

    public static TraineeDto convertToDto(Trainee trainee) {
        return new TraineeDto(trainee.getId(), trainee.getName(), trainee.getEmail(), trainee.getLocation(), trainee.getJoinDate());
    }

    public static Trainee convertToEntity(TraineeDto traineeDto) {
        Trainee trainee = new Trainee();
        trainee.setId(traineeDto.id());
        trainee.setName(traineeDto.name());
        trainee.setEmail(traineeDto.email());
        trainee.setLocation(traineeDto.location());
        trainee.setJoinDate(traineeDto.joinDate());
        return trainee;
    }

}
