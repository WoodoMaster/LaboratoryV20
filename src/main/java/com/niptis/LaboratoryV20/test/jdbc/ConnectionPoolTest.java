package com.niptis.LaboratoryV20.test.jdbc;

import com.niptis.LaboratoryV20.dao.connection.ConnectionPool;
import com.niptis.LaboratoryV20.dao.connection.exception.ConnectionPoolException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectionPoolTest {
    public static void main(String[] args) {
        //working
        String login = "popup2";
        String password = "12aa29";
        String email = "tutRasDva@tut.by";

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            Connection con = connectionPool.takeConnection();
            String sql = "INSERT INTO users(login,password,email) VALUES(?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
            con.close();
        } catch (ConnectionPoolException | SQLException e) {
            e.printStackTrace();
        }


    }
}
