package com.wiley.traineesapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record TraineeDto(int id, @NotBlank(message = "Blank Not Allowed") String name, @Email(message = "Invalid Email") @NotBlank(message = "Blank Not Allowed") String email, @NotBlank(message = "Blank Not Allowed") String location) {
}
