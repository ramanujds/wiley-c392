package com.traineeapp;

import com.traineeapp.model.Trainee;
import com.traineeapp.repository.TraineeRepository;
import com.traineeapp.repository.TraineeRepositoryImpl;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class TraineeApplication {

    public static void main(String[] args) {

        Trainee trainee = new Trainee("Ajay Sunil","ajay@yahoo.com",
                "AP", LocalDate.parse("1999-10-10"));

        TraineeRepository traineeRepository = new TraineeRepositoryImpl();

        try {
            traineeRepository.saveTrainee(trainee);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
