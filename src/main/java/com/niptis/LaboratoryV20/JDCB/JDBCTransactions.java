package com.niptis.LaboratoryV20.JDCB;

import java.sql.*;

public class JDBCTransactions {



        public static void main(String[] args) throws ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/laboratory?useSSL=false", "root",
                        "MyPass");

                // отключаем autocommit
               con.setAutoCommit(false);

              /* try{
                  // int rows = statement.executeUpdate();
               } catch (SQLException e){

               }*/
                System.out.println("ok");
               }




             catch (SQLException e) {
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
