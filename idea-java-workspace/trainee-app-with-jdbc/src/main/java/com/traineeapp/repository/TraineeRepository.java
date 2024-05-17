package com.traineeapp.repository;

import com.traineeapp.model.Trainee;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TraineeRepository {

    public Trainee saveTrainee(Trainee trainee) throws SQLException;

    public Optional<Trainee> getTraineeById(int id) throws SQLException;

    public Optional<Trainee> getTraineeByName(String traineeName) throws SQLException;

    public List<Trainee> getAllTrainees() throws SQLException;

    public void deleteTrainee(int id) throws SQLException;

    public Trainee updateTrainee(int id, Trainee newTrainee) throws SQLException;

}
