package com.niptis.LaboratoryV20.JDCB;

import com.niptis.LaboratoryV20.db.ConnectionPool;
import com.niptis.LaboratoryV20.db.exception.ConnectionPoolException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectionPoolTest {
    public static void main(String[] args) {
        //working
        String login = "popup";
        String password = "12aa29";
        String email = "tutRasDva@tut.by";

        ConnectionPool connectionPool = new ConnectionPool();
        try {
            Connection con = connectionPool.takeConnection();
            String sql = "INSERT INTO users(login,password,email) VALUES(?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();

        } catch (ConnectionPoolException | SQLException e) {
            e.printStackTrace();
        }


    }
}
