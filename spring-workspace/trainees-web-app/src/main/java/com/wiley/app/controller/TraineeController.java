package com.wiley.app.controller;

import com.wiley.app.model.Trainee;
import com.wiley.app.service.TraineeService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/trainees")
public class TraineeController extends HttpServlet {
    TraineeService service = new TraineeService();
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Trainee> trainees = service.getTraineeList();
        req.setAttribute("trainees",trainees);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view-trainees.jsp");
        dispatcher.forward(req,res);
    }


}
