package com.niptis.LaboratoryV20.controller.imp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niptis.LaboratoryV20.controller.Command;
import com.niptis.LaboratoryV20.service.ServiceException;
import com.niptis.LaboratoryV20.service.ServiceFactory;
import com.niptis.LaboratoryV20.service.UserService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginationCommand implements Command {

   private final Logger LOGGER = LogManager.getLogger(LoginationCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login;
        String password;
        login = request.getParameter("login");
        password = request.getParameter("password");
        ServiceFactory factory = ServiceFactory.getInstance();
        UserService userService = factory.getUserService();
        HttpSession session = request.getSession(true);
        try {
            userService.authorization(login,password);
        } catch (ServiceException e) {
            LOGGER.log(Level.ERROR, "Authorization Error.", e);
            redirect(request, response);
        }
        forward(request, response);
    }

    private void redirect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Controller?command=GO_TO_MAINPAGE&loginationInfo=Sorry something gone wrong. Try again");
    }

    private void forward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/logination.jsp");
        dispatcher.forward(request, response);
    }
}