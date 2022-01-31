package com.niptis.LaboratoryV20.dao;

import com.niptis.LaboratoryV20.dao.impl.SQLUserDaoImpl;

public class DAOFactory {
    private final static DAOFactory instance = new DAOFactory();
    private final UserDao userDao = new SQLUserDaoImpl();
    // private final  SQLJobApplicationDAOImpl jobApplicationDAO = new SQLJobApplicationDAOImpl();
    // private final SQLTestPieceDAOImpl testPieceDAO = new SQLTestPieceDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}

