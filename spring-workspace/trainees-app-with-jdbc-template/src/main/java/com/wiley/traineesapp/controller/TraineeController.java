package com.wiley.traineesapp.controller;

import com.wiley.traineesapp.dto.TraineeDto;
import com.wiley.traineesapp.model.Trainee;
import com.wiley.traineesapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainees")
public class TraineeController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping("/{id}")
    public TraineeDto getTrainee(@PathVariable int id){
        return traineeService.getTrainee(id);
    }

    @PostMapping
    public TraineeDto saveTrainee(@RequestBody TraineeDto traineeDto){
        return traineeService.saveTrainee(traineeDto);
    }

    @GetMapping
    public List<TraineeDto> getAllTrainees(){
        return traineeService.getAllTrainees();
    }

}
