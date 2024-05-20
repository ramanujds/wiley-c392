package com.traineeapp.service;

import com.traineeapp.exception.RecordNotFoundException;
import com.traineeapp.model.Trainee;

import java.util.List;
import java.util.Optional;

public interface TraineeService {

    public Trainee saveTrainee(Trainee trainee);

    public Optional<Trainee> getTraineeById(int id) throws RecordNotFoundException;

    public Optional<Trainee> getTraineeByName(String traineeName) throws RecordNotFoundException;

    public List<Trainee> getAllTrainees();

    public void deleteTrainee(int id) throws RecordNotFoundException;

    public Trainee updateTrainee(int id, Trainee newTrainee) throws RecordNotFoundException;

}
