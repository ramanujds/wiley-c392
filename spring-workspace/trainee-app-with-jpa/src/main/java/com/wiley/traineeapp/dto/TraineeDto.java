package com.wiley.traineeapp.dto;

import java.time.LocalDate;
import java.util.List;

public record TraineeDto(int id, String name, String email, String location, LocalDate joinDate, List<LaptopDto> laptops) {
}
