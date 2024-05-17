package com.traineeapp.repository;

import com.traineeapp.model.Trainee;
import com.traineeapp.util.JdbcConnectionUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class TraineeRepositoryImpl implements TraineeRepository{
    @Override
    public Trainee saveTrainee(Trainee trainee)throws SQLException {
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "insert into trainees(trainee_name,email,location,dob) values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,trainee.getTraineeName());
        statement.setString(2,trainee.getEmail());
        statement.setString(3,trainee.getLocation());
        statement.setDate(4, Date.valueOf(trainee.getDob()));
        int rowCount = statement.executeUpdate();
        if(rowCount==0){
            throw new RuntimeException("Failed to Save");
        }
        return trainee;
    }

    @Override
    public Optional<Trainee> getTraineeById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Trainee> getTraineeByName(String traineeName) {
        return Optional.empty();
    }

    @Override
    public List<Trainee> getAllTrainees() {
        return List.of();
    }

    @Override
    public void deleteTrainee(int id) {

    }

    @Override
    public Trainee updateTrainee(int id, Trainee newTrainee) {
        return null;
    }
}
