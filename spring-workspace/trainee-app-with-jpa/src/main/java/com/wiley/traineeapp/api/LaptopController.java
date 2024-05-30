package com.wiley.traineeapp.api;

import com.wiley.traineeapp.dto.LaptopDto;
import com.wiley.traineeapp.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping
    public List<LaptopDto> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("/{id}")
    public LaptopDto getLaptopById(@PathVariable int id) {
        return laptopService.getLaptopById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public LaptopDto saveLaptop(@RequestBody LaptopDto laptop) {
        return laptopService.saveLaptop(laptop);
    }



}
