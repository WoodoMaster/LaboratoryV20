package com.niptis.LaboratoryV20.controller.imp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niptis.LaboratoryV20.controller.Command;
import com.niptis.LaboratoryV20.db.ConnectionPool;
import com.niptis.LaboratoryV20.db.exception.ConnectionPoolException;

public class RegistrationCommand implements Command {
    //private String email; //передается дальше на страницу mainpage
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

      /*  ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
           Connection con = connectionPool.takeConnection();
            String sql = "INSERT INTO users(login,password,email) VALUES(?,?,?)";
           PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();

        } catch (ConnectionPoolException | SQLException e) {
            e.printStackTrace();
        }*/
        redirect(request, response);
    }

    private void redirect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean flag = true;  //Заглушка
        if (flag) {
            //передается на mainpage registrationInfo и email;
            response.sendRedirect("Controller?command=GO_TO_MAINPAGE&registrationInfo=ok" + "&email="
                    //		+ email
            );
            return;
        }
        request.setAttribute("errorMessage", "Не удалось зарегестрироваться. " +
                "Пожалуйста попробуйте позже!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
        dispatcher.forward(request, response);
    }


}
