package com.traineeapp;

import com.traineeapp.exception.RecordNotFoundException;
import com.traineeapp.model.Trainee;
import com.traineeapp.repository.TraineeRepository;
import com.traineeapp.repository.TraineeRepositoryHashMapImpl;
import com.traineeapp.repository.TraineeRepositoryImpl;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class TraineeApplication {

    public static void main(String[] args) {


        TraineeRepository traineeRepository = new TraineeRepositoryHashMapImpl();

        try {
           Trainee trainee = traineeRepository.getTraineeById(10).get();

           trainee.setDob(LocalDate.parse("1999-01-10"));

           Trainee updatedTrainee = traineeRepository.updateTrainee(10,trainee);
            System.out.println(trainee);

        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
