package com.wiley.traineeapp.service;

import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.model.Trainee;

import java.util.List;

public interface TraineeService {

    TraineeDto saveTrainee(TraineeDto trainee);

    TraineeDto getTraineeById(int id);

    List<TraineeDto> getAllTrainees();

    void deleteTrainee(int id);

    TraineeDto updateTrainee(int id, TraineeDto trainee);

    List<TraineeDto> searchTraineeByName(String name);

    List<TraineeDto> searchTraineesByYear(int year);

    List<TraineeDto> findTraineesByLocation(String location);
}
