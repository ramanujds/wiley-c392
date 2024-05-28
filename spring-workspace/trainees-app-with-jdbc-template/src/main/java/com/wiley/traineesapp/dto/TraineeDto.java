package com.wiley.traineesapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record TraineeDto(int id, String name, String email, String location) {
}
