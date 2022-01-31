package com.niptis.LaboratoryV20.service;

import com.niptis.LaboratoryV20.entity.User;

import java.util.List;

public interface FindUserService {
    List<User> find(User user);
}
