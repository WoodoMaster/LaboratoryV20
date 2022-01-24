package com.niptis.LaboratoryV20.service;

import com.niptis.LaboratoryV20.entity.User;
import com.niptis.LaboratoryV20.entity.UserInfo;

public interface UserService {

    User authorization (String login, String password) throws ServiceException;
    boolean registration(UserInfo newUser) throws ServiceException;
    void deactivation (UserInfo user) throws ServiceException;
}
