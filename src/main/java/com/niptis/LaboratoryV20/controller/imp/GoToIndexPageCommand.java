package com.niptis.LaboratoryV20.controller.imp;

import com.niptis.LaboratoryV20.controller.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToIndexPageCommand implements Command {
    private final String index = "index.jsp";

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(index);
        dispatcher.forward(request, response);
    }

}
