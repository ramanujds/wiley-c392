package com.wiley.traineeapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.List;

public record TraineeDto(int id, String name, String email, String location, LocalDate joinDate, @JsonIgnore List<LaptopDto> laptops) {
}
