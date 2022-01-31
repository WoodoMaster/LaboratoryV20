package com.niptis.LaboratoryV20.controller.imp;

import com.niptis.LaboratoryV20.controller.Command;
import com.niptis.LaboratoryV20.test.entity.Greeting;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class GoToRegPageCommand implements Command {
    private final String greeting = "Наша цель - качество вашей продукции";
    private final String requestAttributeName = "myMsg";
    private final String urlAddress = "/WEB-INF/jsp/NewHelloPage.jsp";
    private final String sessionAttributeName = "url";

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Greeting gr = new Greeting(greeting);
        request.setAttribute(requestAttributeName, gr);
        HttpSession session = request.getSession();
        String url = request.getRequestURL().toString();

        session.setAttribute(sessionAttributeName, url);

        RequestDispatcher dispatcher = request.getRequestDispatcher(urlAddress);
        dispatcher.forward(request, response);
    }

}
