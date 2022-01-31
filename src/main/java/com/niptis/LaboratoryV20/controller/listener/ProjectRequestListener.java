package com.niptis.LaboratoryV20.controller.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ProjectRequestListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String contextPath = context.getContextPath();
        System.out.println("Context  was initialized " + contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String contextPath = context.getContextPath();
        System.out.println("Context  was destroyed" + contextPath);
    }

}
