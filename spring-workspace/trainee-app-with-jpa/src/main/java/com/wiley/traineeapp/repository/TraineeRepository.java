package com.wiley.traineeapp.repository;

import com.wiley.traineeapp.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {
}
