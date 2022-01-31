package com.niptis.LaboratoryV20.dao;


import com.niptis.LaboratoryV20.entity.User;


public interface UserDao {
    User authorization(String name, String password) throws DAOException;

    boolean registration(User user) throws DAOException;
}
