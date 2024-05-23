package com.wiley.app.controller;

import com.wiley.app.model.Trainee;
import com.wiley.app.service.TraineeService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/add-trainee")
public class TraineesRegistrationController extends HttpServlet {

    TraineeService service = new TraineeService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        Trainee trainee = new Trainee(id,name,email);

        Trainee  tr = service.saveTrainee(trainee);

        HttpSession session = req.getSession();
        session.setAttribute("trainee",tr);

        resp.sendRedirect("view-trainee.jsp");

    }
}
