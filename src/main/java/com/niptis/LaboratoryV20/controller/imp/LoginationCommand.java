package com.niptis.LaboratoryV20.controller.imp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;
import com.niptis.LaboratoryV20.controller.Command;
import com.niptis.LaboratoryV20.entity.User;
import com.niptis.LaboratoryV20.service.ServiceException;
import com.niptis.LaboratoryV20.service.ServiceFactory;
import com.niptis.LaboratoryV20.service.UserService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginationCommand implements Command {
    private boolean flag;
    private final Logger LOGGER = LogManager.getLogger(LoginationCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        ServiceFactory factory = ServiceFactory.getInstance();
        UserService userService = factory.getUserService();
        try {
            User user = userService.authorization(login, password);
            flag = true;
            redirect(request, response);
        } catch (ServiceException e) {
            LOGGER.log(Level.ERROR, "Authorization Error.", e);
            flag = false;
            redirect(request, response);
        }
    }

    private void redirect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (flag) {
            response.sendRedirect("Controller?command=GO_TO_MAINPAGE&loginationInfo=ok");
            return;
        }
        response.sendRedirect("MyController?command=logination&loginationInfo=notOk");
    }
}