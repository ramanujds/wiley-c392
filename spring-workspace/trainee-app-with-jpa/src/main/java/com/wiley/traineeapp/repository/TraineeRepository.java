package com.wiley.traineeapp.repository;

import com.wiley.traineeapp.model.Trainee;
import jakarta.persistence.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

    @Query("from Trainee where name like :name%")
    List<Trainee> findByName(@Param("name") String name);


    // find by joining date range

    // find by joining year
    @Query(value = "select * from trainee_data where year(joined_date)=:year", nativeQuery = true)
    List<Trainee> findByJoiningYear(int year);

    // Named Query
    @Query(name = "findByLocation")
    public List<Trainee> findByLocation(String location);

    public boolean existsByEmail(String email);


}
