package com.niptis.LaboratoryV20.dao;


import com.niptis.LaboratoryV20.entity.User;
import com.niptis.LaboratoryV20.entity.UserInfo;

public interface UserDao {
    User authorization(String name, String password) throws DAOException;

    boolean registration(UserInfo userInfo) throws DAOException;
}
