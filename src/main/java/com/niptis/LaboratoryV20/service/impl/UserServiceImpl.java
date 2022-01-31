package com.niptis.LaboratoryV20.service.impl;

import com.niptis.LaboratoryV20.dao.DAOException;
import com.niptis.LaboratoryV20.dao.DAOFactory;
import com.niptis.LaboratoryV20.dao.UserDao;
import com.niptis.LaboratoryV20.entity.User;
import com.niptis.LaboratoryV20.service.ServiceException;
import com.niptis.LaboratoryV20.service.UserService;
import com.niptis.LaboratoryV20.service.validation.impl.SizeValidationImpl;


public class UserServiceImpl implements UserService {
    private final SizeValidationImpl sizeValidation = new SizeValidationImpl();

    @Override
    public User authorization(String name, String pass) throws ServiceException {
        int minSizeOfCharInLogin = 4;
        int maxSizeOfCharInLogin = 16;
        int minSizeOfCharInPass = 5;
        int maxSizeOfCharInPass = 20;
        if (sizeValidation.sizeValidation(name, minSizeOfCharInLogin, maxSizeOfCharInLogin) &
                sizeValidation.sizeValidation(pass, minSizeOfCharInPass, maxSizeOfCharInPass)) {
            DAOFactory factory = DAOFactory.getInstance();
            UserDao userDao = factory.getUserDao();
            User user;
            try {
                user = userDao.authorization(name, pass);
            } catch (DAOException e) {
                throw new ServiceException(e);
            }
            return user;
        }
        throw new ServiceException("Validation error");
    }

    @Override
    public boolean registration(User newUser) {
        return false;
    }

    @Override
    public void deactivation(User user) throws ServiceException {
    }


}
