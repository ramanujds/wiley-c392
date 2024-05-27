package com.wiley.traineesapp.controller;

import com.wiley.traineesapp.dto.TraineeDto;
import com.wiley.traineesapp.model.Trainee;
import com.wiley.traineesapp.service.TraineeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
public class TraineeController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping("/index")
    public String viewAllTrainees(Model model){
       List<TraineeDto> trainees = traineeService.getAllTrainees();
       model.addAttribute("trainees",trainees);
       log.info("All Trainees : ");
         trainees.forEach(trainee -> log.info(trainee.toString()));
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteTrainee(@PathVariable("id") int id){
        traineeService.deleteTrainee(id);
        return "redirect:/index";
    }

    @GetMapping("/add-trainee")
    public String addTrainee(Trainee trainee){
        return "add-trainee";
    }

    @PostMapping("/save-trainee")
    public String saveTrainee(@Valid TraineeDto trainee, BindingResult bindingResult, Model model){
       log.info("Trainee : "+trainee);

       log.info("Binding Result : "+bindingResult);

        if (bindingResult.hasErrors()){
            return "redirect:/add-trainee";
        }
        traineeService.saveTrainee(trainee);
        return "redirect:/index";
    }



}
