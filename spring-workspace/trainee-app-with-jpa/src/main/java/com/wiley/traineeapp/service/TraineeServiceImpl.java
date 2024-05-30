package com.wiley.traineeapp.service;

import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.exception.DuplicateRecordException;
import com.wiley.traineeapp.exception.RecordNotFoundException;
import com.wiley.traineeapp.model.Laptop;
import com.wiley.traineeapp.model.Trainee;
import com.wiley.traineeapp.repository.LaptopRepository;
import com.wiley.traineeapp.repository.TraineeRepository;
import com.wiley.traineeapp.util.LaptopEntityDtoUtil;
import com.wiley.traineeapp.util.TraineeEntityDtoUtil;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.wiley.traineeapp.util.TraineeEntityDtoUtil.*;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService {

    private TraineeRepository traineeRepository;
    private LaptopRepository laptopRepository;

    @Autowired
    public TraineeServiceImpl(TraineeRepository traineeRepository, LaptopRepository laptopRepository) {
        this.traineeRepository = traineeRepository;
        this.laptopRepository = laptopRepository;
    }

    public TraineeDto saveTrainee(TraineeDto trainee) {
        if (traineeRepository.existsById(trainee.id()) || traineeRepository.existsByEmail(trainee.email())) {
            throw new DuplicateRecordException("Email or ID is already present");
        }
        Trainee savedTrainee = traineeRepository.save(convertToEntity(trainee));
        return convertToDto(savedTrainee);
    }


    public TraineeDto getTraineeById(int id) {
        return traineeRepository.findById(id).map(TraineeEntityDtoUtil::convertToDto)
                .orElseThrow(() -> new RecordNotFoundException("Trainee with id " + id + " Not Present"));
    }

    public List<TraineeDto> getAllTrainees() {
        return traineeRepository.findAll().parallelStream()
                .map(TraineeEntityDtoUtil::convertToDto)
                .toList();
    }

    public void deleteTrainee(int id) {
        if (!traineeRepository.existsById(id)) {
            throw new RecordNotFoundException("Trainee with id " + id + " Not Present");
        }
        traineeRepository.deleteById(id);
    }






    public TraineeDto updateTrainee(int id, TraineeDto trainee) {


        Trainee traineeToUpdate = traineeRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("Trainee with id " + id + " Not Present"));

        if (trainee.email() != null) traineeToUpdate.setEmail(trainee.email());
        if (trainee.name() != null) traineeToUpdate.setName(trainee.name());
        if (trainee.location() != null) traineeToUpdate.setLocation(trainee.location());
        if (trainee.joinDate() != null) traineeToUpdate.setJoinDate(trainee.joinDate());
        if (traineeToUpdate.getLaptops() != null) {
            traineeToUpdate.getLaptops().addAll(trainee.laptops().parallelStream().map(LaptopEntityDtoUtil::toEntity).toList());
        }
        Trainee updatedTrainee = traineeRepository.save(traineeToUpdate);

        return convertToDto(updatedTrainee);


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
