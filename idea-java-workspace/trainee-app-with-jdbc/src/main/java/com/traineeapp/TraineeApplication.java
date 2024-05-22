package com.traineeapp;

import com.traineeapp.config.AppConfig;
import com.traineeapp.exception.RecordNotFoundException;
import com.traineeapp.model.Trainee;
import com.traineeapp.repository.TraineeRepository;
import com.traineeapp.repository.TraineeRepositoryHashMapImpl;
import com.traineeapp.repository.TraineeRepositoryImpl;
import com.traineeapp.service.TraineeService;
import com.traineeapp.service.TraineeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class TraineeApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TraineeService traineeService = context.getBean(TraineeService.class);


        try {

            traineeService.getTraineeById(10).ifPresent(System.out::println);

        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
