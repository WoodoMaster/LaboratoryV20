package com.niptis.LaboratoryV20.listener;

import com.niptis.LaboratoryV20.db.ConnectionPool;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ConnectionPoolInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext context =  sce.getServletContext();
        String contextPath = context.getContextPath();
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        System.out.println("ConnectionPool was created");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context =  sce.getServletContext();
        String contextPath = context.getContextPath();
        System.out.println("ConnectionPool was destroyed");
    }
}
