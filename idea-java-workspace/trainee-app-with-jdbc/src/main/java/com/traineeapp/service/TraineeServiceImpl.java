package com.traineeapp.service;

import com.traineeapp.exception.RecordNotFoundException;
import com.traineeapp.model.Trainee;
import com.traineeapp.repository.TraineeRepository;

import java.util.List;
import java.util.Optional;

public class TraineeServiceImpl implements TraineeService {

    private final TraineeRepository repository;

    public TraineeServiceImpl(TraineeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Trainee saveTrainee(Trainee trainee) {
         return repository.saveTrainee(trainee);
    }

    @Override
    public Optional<Trainee> getTraineeById(int id) throws RecordNotFoundException {
        return repository.getTraineeById(id);
    }

    @Override
    public Optional<Trainee> getTraineeByName(String traineeName) throws RecordNotFoundException {
        return repository.getTraineeByName(traineeName);
    }

    @Override
    public List<Trainee> getAllTrainees() {
        return repository.getAllTrainees();
    }

    @Override
    public void deleteTrainee(int id) throws RecordNotFoundException {
        repository.deleteTrainee(id);
    }

    @Override
    public Trainee updateTrainee(int id, Trainee newTrainee) throws RecordNotFoundException {
        return repository.updateTrainee(id,newTrainee);
    }


}
