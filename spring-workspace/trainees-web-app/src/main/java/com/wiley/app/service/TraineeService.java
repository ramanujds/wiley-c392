package com.wiley.app.service;

import com.wiley.app.model.Trainee;

import java.util.ArrayList;
import java.util.List;

public class TraineeService {

    static List<Trainee> traineeList = new ArrayList<>();



    public Trainee saveTrainee(Trainee trainee){
        traineeList.add(trainee);
        return trainee;
    }

    public List<Trainee> getTraineeList(){
        return traineeList;
    }

    public Trainee getTraineeById(int id){
        return traineeList.stream().filter(trainee -> trainee.id() == id).findFirst().orElse(null);
    }



}
