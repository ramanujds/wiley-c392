package com.wiley.traineeapp.api;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.dto.TraineeDto;
import com.wiley.traineeapp.service.LaptopService;
import com.wiley.traineeapp.service.TraineeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trainees")
public class TraineeController {

    private static final Logger log = LoggerFactory.getLogger(TraineeController.class);
    @Autowired
    private TraineeService traineeService;

    @Autowired
    private LaptopService laptopService;


    @GetMapping
    public List<TraineeDto> getAllTrainees(){
        return traineeService.getAllTrainees();
    }



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
    public TraineeDto getTraineeById(@PathVariable("id") int traineeId,
                                     @RequestHeader("username") String username,
                                     @RequestHeader("password") String password){
        log.info("Headers : ");
        log.info(username);
        log.info(password);
        return traineeService.getTraineeById(traineeId);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTraineeById(@PathVariable("id") int traineeId){
        traineeService.deleteTrainee(traineeId);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TraineeDto updateTrainee(@PathVariable int id, @RequestBody TraineeDto traineeDto){
        TraineeDto dto = traineeService.updateTrainee(id,traineeDto);
        LaptopDto laptopDto = laptopService.getLaptopById(traineeDto.laptop().id());

        return new TraineeDto(dto.id(),dto.name(),dto.email(),dto.location(),dto.joinDate(),laptopDto);

    }

    @GetMapping("/search")
    public List<TraineeDto> searchTrainees(@RequestParam("name") String name){
            return traineeService.searchTraineeByName(name);
    }

    @GetMapping("/year/{year}")
    public List<TraineeDto> searchTraineesByYear(@PathVariable("year") int year){
        return traineeService.searchTraineesByYear(year);
    }

    @GetMapping("/location/{location}")
    public List<TraineeDto> searchTraineesByLocation(@PathVariable String location){
        return traineeService.findTraineesByLocation(location);
    }


}
