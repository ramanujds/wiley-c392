package com.traineeapp.repository;

import com.traineeapp.exception.RecordNotFoundException;
import com.traineeapp.model.Trainee;

import java.util.List;
import java.util.Optional;

public class TraineeRepositoryHashMapImpl implements TraineeRepository{
    @Override
    public Trainee saveTrainee(Trainee trainee) {
        return null;
    }

    @Override
    public Optional<Trainee> getTraineeById(int id) throws RecordNotFoundException {
        return Optional.empty();
    }

    @Override
    public Optional<Trainee> getTraineeByName(String traineeName) throws RecordNotFoundException {
        return Optional.empty();
    }

    @Override
    public List<Trainee> getAllTrainees() {
        return List.of();
    }

    @Override
    public void deleteTrainee(int id) throws RecordNotFoundException {

    }

    @Override
    public Trainee updateTrainee(int id, Trainee newTrainee) throws RecordNotFoundException {
        return null;
    }
}
