package com.niptis.LaboratoryV20.controller.imp;

import com.niptis.LaboratoryV20.controller.Command;
import com.niptis.LaboratoryV20.entity.Greeting;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class GoToNewHelloPage implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String url = request.getRequestURL().toString();
        String uri = request.getRequestURI();
        System.out.println("url = " + url);
        System.out.println("uri = " + uri);
        session.setAttribute("url", url);

        Greeting gr = new Greeting("Наша цель - качество вашей продукции");
        request.setAttribute("myMsg", gr);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/NewHelloPage.jsp");
        dispatcher.forward(request, response);
    }

}
