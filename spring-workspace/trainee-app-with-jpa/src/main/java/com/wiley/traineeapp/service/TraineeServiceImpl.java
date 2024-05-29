package com.wiley.traineeapp.service;

import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.model.Trainee;
import com.wiley.traineeapp.repository.TraineeRepository;
import com.wiley.traineeapp.util.TraineeEntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.wiley.traineeapp.util.TraineeEntityDtoUtil.*;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService{

    private TraineeRepository traineeRepository;

    @Autowired
    public TraineeServiceImpl(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    public TraineeDto saveTrainee(TraineeDto trainee) {
        Trainee savedTrainee = traineeRepository.save(convertToEntity(trainee));
        return convertToDto(savedTrainee);
    }

    public TraineeDto getTraineeById(int id) {
        return traineeRepository.findById(id).map(TraineeEntityDtoUtil::convertToDto)
                .orElse(null);
    }

    public List<TraineeDto> getAllTrainees() {
        return traineeRepository.findAll().parallelStream()
                .map(TraineeEntityDtoUtil::convertToDto)
                .toList();
    }

    public void deleteTrainee(int id) {
        traineeRepository.deleteById(id);
    }

    public TraineeDto updateTrainee(int id, TraineeDto trainee) {
        if(traineeRepository.existsById(id)) {
            Trainee savedTrainee = traineeRepository.save(convertToEntity(trainee));
            return convertToDto(savedTrainee);
        }
        return null;
    }

    @Override
    public List<TraineeDto> searchTraineeByName(String name) {
        return traineeRepository.findByName(name).parallelStream().map(TraineeEntityDtoUtil::convertToDto)
                .toList();
    }

    @Override
    public List<TraineeDto> searchTraineesByYear(int year) {
        return traineeRepository.findByJoiningYear(year).stream().map(TraineeEntityDtoUtil::convertToDto)
                .toList();
    }

    @Override
    public List<TraineeDto> findTraineesByLocation(String location) {
        return traineeRepository.findByLocation(location)
                .parallelStream()
                .map(TraineeEntityDtoUtil::convertToDto)
                .toList();
    }
}
