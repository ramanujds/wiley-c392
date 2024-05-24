package com.wiley.traineesapp.util;

import com.wiley.traineesapp.exception.RecordNotFoundException;
import com.wiley.traineesapp.model.Trainee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TraineeRowMapper implements RowMapper<Trainee> {


    @Override
    public Trainee mapRow(ResultSet rs, int rowNum) throws SQLException {

        Trainee trainee = new Trainee();
        trainee.setId(rs.getInt("id"));
        trainee.setName(rs.getString("trainee_name"));
        trainee.setEmail(rs.getString("email"));
        trainee.setLocation(rs.getString("location"));
        return trainee;
    }
}
