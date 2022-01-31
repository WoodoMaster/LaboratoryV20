package com.niptis.LaboratoryV20.test.jdbc;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            System.out.println("Start...");

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/laboratory?useSSL=false", "root",
                    "104");
            // одиночный запрос типа statement0

            statement = con.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getString(4) + " " +
                        resultSet.getString(5));
            }

            // Запись в таблицу users через PreparedStatement
            String sql = "INSERT INTO users(login,password,email,phone,status) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, "User04");
            preparedStatement.setString(2, "12334");
            preparedStatement.setString(3, "user03@gmail.com");
            preparedStatement.setString(4, "2262113");
            preparedStatement.setString(5, "Active");

            System.out.println(preparedStatement.executeUpdate());


            System.out.println("ok");
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        } finally {


            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
    }
}
