package com.niptis.LaboratoryV20.dao.impl;

import com.niptis.LaboratoryV20.dao.DAOException;
import com.niptis.LaboratoryV20.dao.UserDao;
import com.niptis.LaboratoryV20.db.ConnectionPool;
import com.niptis.LaboratoryV20.db.exception.ConnectionPoolException;
import com.niptis.LaboratoryV20.entity.User;
import com.niptis.LaboratoryV20.entity.UserInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLUserDaoImpl implements UserDao {
    ConnectionPool connectionPool = ConnectionPool.getInstance();

    @Override
    public User authorization(String name, String password) throws DAOException {
        Statement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {
            connection = connectionPool.takeConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT*FROM laboratory.users where (users.login = \'" + name + "\'" +
                    " and users.password = \'" + password + "\')");
            System.out.println(name + " " + password);
            if (resultSet.next()) {
                String userName = resultSet.getString(1);
                String userPassword = resultSet.getString(2);
                String userEmail = resultSet.getString(3);
                connection.close();
                System.out.println("Authorization complete");
                System.out.println(userName + " " + userEmail + " " + userPassword);
                return new User(userName, userEmail, userPassword);
            }

        } catch (ConnectionPoolException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean registration(UserInfo userInfo) throws DAOException {
        return false;
    }

}
