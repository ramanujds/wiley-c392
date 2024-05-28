package com.wiley.traineesapp.repository;

import com.wiley.traineesapp.dto.TraineeDto;
import com.wiley.traineesapp.model.Trainee;

import java.util.List;
import java.util.Optional;

public interface TraineeRepository {

    public Trainee saveTrainee(Trainee trainee);

    public Optional<Trainee> getTraineeById(int id);

    public Optional<Trainee> getTraineeByName(String name);

    public List<Trainee> getAllTrainees();

    public void deleteTrainee(int id);

    public Trainee updateTrainee(int id, Trainee trainee);

}
