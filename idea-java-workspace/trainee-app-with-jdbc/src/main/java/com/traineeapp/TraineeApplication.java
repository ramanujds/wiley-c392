package com.traineeapp;

import com.traineeapp.model.Trainee;
import com.traineeapp.repository.TraineeRepository;
import com.traineeapp.repository.TraineeRepositoryImpl;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class TraineeApplication {

    public static void main(String[] args) {


        TraineeRepository traineeRepository = new TraineeRepositoryImpl();

        try {
            traineeRepository.deleteTrainee(25);
            traineeRepository.getAllTrainees().forEach(System.out::println);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
