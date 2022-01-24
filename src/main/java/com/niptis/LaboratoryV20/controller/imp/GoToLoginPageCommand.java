package com.niptis.LaboratoryV20.controller.imp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niptis.LaboratoryV20.controller.Command;

public class GoToLoginPageCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String url = request.getRequestURL().toString();
		System.out.println("url = " + url);
		session.setAttribute("url", url);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/logination.jsp");
		dispatcher.forward(request, response);
	}

}
