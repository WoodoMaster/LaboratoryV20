package com.niptis.LaboratoryV20.controller.imp;

import com.niptis.LaboratoryV20.controller.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class GoToLoginPageCommand implements Command {
    private final String location = "/WEB-INF/jsp/logination.jsp";
    private final String urlString = "url";

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String url = request.getRequestURL().toString();
        session.setAttribute(url, urlString);
        RequestDispatcher dispatcher = request.getRequestDispatcher(location);
        dispatcher.forward(request, response);
    }

}
