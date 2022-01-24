package com.niptis.LaboratoryV20.dao;

import com.niptis.LaboratoryV20.dao.impl.SQLUserDaoImpl;

public class DAOFactory {
    private final static DAOFactory instance = new DAOFactory();
    private final SQLUserDaoImpl SQLUserDaoImpl = new SQLUserDaoImpl();
    // private final  SQLJobApplicationDAOImpl jobApplicationDAO = new SQLJobApplicationDAOImpl();
    // private final SQLTestPieceDAOImpl testPieceDAO = new SQLTestPieceDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public SQLUserDaoImpl getSQLUserDao() {
        return SQLUserDaoImpl;
    }

  /*  public SQLJobApplicationDAOImpl getJobApplicationDAO() {     return jobApplicationDAO;}
    public SQLTestPieceDAOImpl getTestPieceDAO() {return testPieceDAO;}*/
}

