package com.wiley.traineesapp.controller;

import com.wiley.traineesapp.dto.TraineeDto;
import com.wiley.traineesapp.model.Trainee;
import com.wiley.traineesapp.service.TraineeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
public class TraineeController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping("/view-all")
    public String viewAllTrainees(Model model){
       List<TraineeDto> trainees = traineeService.getAllTrainees();
       model.addAttribute("trainees",trainees);
       log.info("All Trainees : ");
         trainees.forEach(trainee -> log.info(trainee.toString()));
        return "show-trainees.jsp";
    }

    @GetMapping("/delete-trainee")
    public String deleteTrainee(@RequestParam("id") int id){
        traineeService.deleteTrainee(id);
        return "redirect:/view-all";
    }



}
