package com.wiley.traineeapp.repository;

import com.wiley.traineeapp.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
