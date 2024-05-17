package com.traineeapp.repository;

import com.traineeapp.model.Trainee;
import com.traineeapp.util.JdbcConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
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
        JdbcConnectionUtil.closeConnection();
        return trainee;
    }

    @Override
    public Optional<Trainee> getTraineeById(int id) throws SQLException {
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "select * from trainees where id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1,id);
        ResultSet queryResult = statement.executeQuery();
        JdbcConnectionUtil.closeConnection();
        return getTraineeFromResult(queryResult);
    }

    @Override
    public Optional<Trainee> getTraineeByName(String traineeName) throws SQLException{
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "select * from trainees where trainee_name like ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,traineeName+"%");
        ResultSet queryResult = statement.executeQuery();
        Optional<Trainee> trainee = getTraineeFromResult(queryResult);
        JdbcConnectionUtil.closeConnection();
        return trainee;
    }

    @Override
    public List<Trainee> getAllTrainees() throws SQLException {
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "select * from trainees";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet queryResult = statement.executeQuery();
        List<Trainee> trainees = getTraineesFromResult(queryResult);
        JdbcConnectionUtil.closeConnection();
        return trainees;
    }

    @Override
    public void deleteTrainee(int id) throws SQLException{
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "delete from trainees where id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1,id);
        int rowCount = statement.executeUpdate();
        if(rowCount==0){
            throw new RuntimeException("Failed to Delete");
        }
        JdbcConnectionUtil.closeConnection();
    }

    @Override
    public Trainee updateTrainee(int id, Trainee newTrainee) {
        return null;
    }

    private Optional<Trainee> getTraineeFromResult(ResultSet resultSet) throws SQLException {
        // ResultSetMetaData metaData = resultSet.getMetaData();

        if (resultSet.next()){
            Trainee trainee = processResultSet(resultSet);
            return Optional.of(trainee);
        }
        return Optional.empty();
    }

    private Trainee processResultSet(ResultSet resultSet) throws SQLException {
        Trainee trainee = new Trainee();
        trainee.setId(resultSet.getInt("id"));
        trainee.setTraineeName(resultSet.getString("trainee_name"));
        trainee.setEmail(resultSet.getString("email"));
        Date dob = resultSet.getDate("dob");
        if (dob != null) {
            trainee.setDob(dob.toLocalDate());
        }
        trainee.setLocation(resultSet.getString("location"));
        trainee.setLaptopId(resultSet.getInt("laptop_id"));
        trainee.setTeamLead(resultSet.getInt("team_lead"));
        return trainee;
    }

    private List<Trainee> getTraineesFromResult(ResultSet resultSet) throws SQLException {
        // ResultSetMetaData metaData = resultSet.getMetaData();
        List<Trainee> trainees =new ArrayList<>();
        while (resultSet.next()){
            Trainee trainee = processResultSet(resultSet);
            trainees.add(trainee);
        }
        return trainees;
    }

}
