package com.wiley.traineesapp.repository;

import com.wiley.traineesapp.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class TraineeRepositoryImpl implements TraineeRepository {

    private final JdbcTemplate jdbcTemplate;

   RowMapper<Trainee> rowMapper = ((rs, rowNum) -> {
       Trainee trainee = new Trainee();
       trainee.setId(rs.getInt("id"));
       trainee.setName(rs.getString("trainee_name"));
       trainee.setEmail(rs.getString("email"));
       trainee.setLocation(rs.getString("location"));
       return trainee;
   });


    @Autowired
    public TraineeRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Trainee saveTrainee(Trainee trainee) {
        jdbcTemplate.update("insert into trainees(trainee_name,email,location) values(?,?,?)",
                trainee.getName(), trainee.getEmail(), trainee.getLocation());
        return getTraineeByName(trainee.getName()).orElse(null);
    }

    public Optional<Trainee> getTraineeById(int id) {
        Trainee trainee = jdbcTemplate.queryForObject("select id,trainee_name,email,location from trainees where id=" + id, rowMapper);
        return Optional.of(trainee);
    }

    public Optional<Trainee> getTraineeByName(String name) {
      Trainee trainee =jdbcTemplate.queryForObject("""
                select * from trainees where trainee_name='%s'
                """.formatted(name), rowMapper);
        return Optional.of(trainee);
    }

    public List<Trainee> getAllTrainees() {
        return jdbcTemplate.query("select * from trainees", rowMapper);
    }

    public void deleteTrainee(int id) {
        jdbcTemplate.update("delete from trainees where id=?",id);
    }
}
