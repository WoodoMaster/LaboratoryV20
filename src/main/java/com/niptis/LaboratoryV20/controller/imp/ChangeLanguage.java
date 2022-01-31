package com.niptis.LaboratoryV20.controller.imp;

import com.niptis.LaboratoryV20.controller.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChangeLanguage implements Command {
    private final String localeString = "locale";
    private final String urlString = "url";

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String locale = request.getParameter(localeString);
        request.getSession().setAttribute(localeString, locale);
        String url = (String) request.getSession().getAttribute(urlString);
        response.sendRedirect(url);
    }
}
