package com.niptis.LaboratoryV20.service;

import com.niptis.LaboratoryV20.entity.User;


public interface UserService {

    User authorization(String login, String password) throws ServiceException;

    boolean registration(User newUser) throws ServiceException;

    void deactivation(User user) throws ServiceException;
}
