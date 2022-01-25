package com.niptis.LaboratoryV20.service.impl;

import com.niptis.LaboratoryV20.dao.impl.SQLUserDaoImpl;
import com.niptis.LaboratoryV20.entity.User;
import com.niptis.LaboratoryV20.service.ServiceException;
import com.niptis.LaboratoryV20.service.UserService;
import com.niptis.LaboratoryV20.dao.DAOException;
import com.niptis.LaboratoryV20.dao.DAOFactory;
import com.niptis.LaboratoryV20.entity.UserInfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {
    @Override
    public User authorization(String name, String pass) throws ServiceException {
        if(validation(name)&validation(pass)){
        DAOFactory factory = DAOFactory.getInstance();
        SQLUserDaoImpl userDao = factory.getSQLUserDao();
        User user;
        try {
           user = userDao.authorization(name,pass);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return user;}
        throw new ServiceException("Validation error");
    }

    @Override
    public boolean registration(UserInfo newUser) {
        return false;
    }

    @Override
    public void deactivation(UserInfo user) throws ServiceException { }

    private boolean validation(String arg){
        Pattern pattern = Pattern.compile("\\w{1,10}");
        Matcher matcher =pattern.matcher(arg);
        return matcher.matches();

    }
}
