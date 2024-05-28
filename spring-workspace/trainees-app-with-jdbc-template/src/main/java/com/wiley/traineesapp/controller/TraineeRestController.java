package com.wiley.traineesapp.controller;

import com.wiley.traineesapp.dto.TraineeDto;
import com.wiley.traineesapp.model.Trainee;
import com.wiley.traineesapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trainees")
public class TraineeRestController {

    @Autowired
    private TraineeService traineeService;


    @GetMapping
    public List<TraineeDto> getAllTrainees(){
        return traineeService.getAllTrainees();
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public TraineeDto saveTrainee(@RequestBody TraineeDto traineeDto){
//        return traineeService.saveTrainee(traineeDto);
//    }

    @PostMapping
    public ResponseEntity<TraineeDto> saveTrainee(@RequestBody TraineeDto traineeDto){
        TraineeDto savedTrainee = traineeService.saveTrainee(traineeDto);
        HttpStatus status;
        if(savedTrainee!=null){
            status = HttpStatus.CREATED;
        }
        else {
            status = HttpStatus.BAD_REQUEST;
        }
        return ResponseEntity.status(status).body(savedTrainee);
    }

    @GetMapping("/{id}")
    public TraineeDto getTraineeById(@PathVariable("id") int traineeId){
       return traineeService.getTrainee(traineeId);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTraineeById(@PathVariable("id") int traineeId){
        traineeService.deleteTrainee(traineeId);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TraineeDto updateTrainee(@PathVariable int id, @RequestBody TraineeDto traineeDto){
        return traineeService.updateTrainee(id,traineeDto);
    }


}
