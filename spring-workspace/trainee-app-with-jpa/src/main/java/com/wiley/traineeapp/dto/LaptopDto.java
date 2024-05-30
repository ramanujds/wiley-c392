package com.wiley.traineeapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wiley.traineeapp.model.Trainee;

public record LaptopDto(int id, String brand, String model, float price){
}
