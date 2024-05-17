package com.traineeapp.repository;

import com.traineeapp.exception.RecordNotFoundException;
import com.traineeapp.model.Trainee;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TraineeRepository {

    public Trainee saveTrainee(Trainee trainee);

    public Optional<Trainee> getTraineeById(int id) throws RecordNotFoundException;

    public Optional<Trainee> getTraineeByName(String traineeName) throws RecordNotFoundException;

    public List<Trainee> getAllTrainees();

    public void deleteTrainee(int id) throws RecordNotFoundException;

    public Trainee updateTrainee(int id, Trainee newTrainee) throws RecordNotFoundException;

}
