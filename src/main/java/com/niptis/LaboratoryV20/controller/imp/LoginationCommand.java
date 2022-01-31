package com.niptis.LaboratoryV20.controller.imp;

import com.niptis.LaboratoryV20.controller.Command;
import com.niptis.LaboratoryV20.entity.User;
import com.niptis.LaboratoryV20.service.ServiceException;
import com.niptis.LaboratoryV20.service.ServiceFactory;
import com.niptis.LaboratoryV20.service.UserService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginationCommand implements Command {
    private boolean isLoginationCorrect;
    private final Logger LOGGER = LogManager.getLogger(LoginationCommand.class);
    private final String requestFirstParameter = "login";
    private final String requestSecondParameter = "password";
    private final String redirectUrlIfOk = "Controller?command=GO_TO_MAINPAGE&loginationInfo=ok";
    private final String redirectUrlIfNotOk = "MyController?command=logination&loginationInfo=notOk";
    private final String loggerMessage = "Authorization Error";


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter(requestFirstParameter);
        String password = request.getParameter(requestSecondParameter);
        ServiceFactory factory = ServiceFactory.getInstance();
        UserService userService = factory.getUserService();
        try {
            User user = userService.authorization(login, password);
            isLoginationCorrect = true;
            redirect(request, response);
        } catch (ServiceException e) {
            LOGGER.log(Level.ERROR, loggerMessage, e);
            isLoginationCorrect = false;
            redirect(request, response);
        }
    }

    private void redirect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isLoginationCorrect) {
            response.sendRedirect(redirectUrlIfOk);
            return;
        }
        response.sendRedirect(redirectUrlIfNotOk);
    }
}