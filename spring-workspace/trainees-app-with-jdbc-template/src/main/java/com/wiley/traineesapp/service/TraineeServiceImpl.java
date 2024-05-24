package com.wiley.traineesapp.service;

import com.wiley.traineesapp.dto.TraineeDto;
import com.wiley.traineesapp.model.Trainee;
import com.wiley.traineesapp.repository.TraineeRepository;
import com.wiley.traineesapp.util.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService{

    private final TraineeRepository repository;

    @Autowired
    public TraineeServiceImpl(TraineeRepository repository) {
        this.repository = repository;
    }

    public TraineeDto saveTrainee(TraineeDto traineeDto) {
        Trainee trainee = repository.saveTrainee(EntityDtoUtil.convertToTraineeEntity(traineeDto));
        return EntityDtoUtil.convertToTraineeDto(trainee);
    }

    public TraineeDto getTrainee(int id) {
        return repository.getTraineeById(id).map(EntityDtoUtil::convertToTraineeDto).orElse(null);
    }

    public TraineeDto getTraineeByName(String name) {
        return repository.getTraineeByName(name).map(EntityDtoUtil::convertToTraineeDto).orElse(null);
    }

    public void deleteTrainee(int id) {
        repository.deleteTrainee(id);
    }

    public List<TraineeDto> getAllTrainees() {
        return repository.getAllTrainees().parallelStream().map(EntityDtoUtil::convertToTraineeDto).toList();
    }
}
