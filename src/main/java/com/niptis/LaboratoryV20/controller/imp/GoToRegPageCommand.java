package com.niptis.LaboratoryV20.controller.imp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niptis.LaboratoryV20.controller.Command;
import com.niptis.LaboratoryV20.entity.Greeting;

public class GoToRegPageCommand implements Command {


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Greeting gr = new Greeting("Приветствуем нового пользователя!");
        request.setAttribute("myMsg", gr);
        HttpSession session = request.getSession();
        String url = request.getRequestURL().toString();
        String uri = request.getRequestURI();


        System.out.println("url = " + url);
        System.out.println("uri = " + uri);
        session.setAttribute("url", url);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
        dispatcher.forward(request, response);
    }

}
