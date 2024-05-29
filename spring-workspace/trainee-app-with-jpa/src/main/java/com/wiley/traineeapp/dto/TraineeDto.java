package com.wiley.traineeapp.dto;

import java.time.LocalDate;

public record TraineeDto(int id, String name, String email, String location, LocalDate joinDate) {
}
