package com.niptis.LaboratoryV20.service;

import com.niptis.LaboratoryV20.entity.UserInfo;

import java.util.List;

public interface FindUserService {
    List<UserInfo> find (UserInfo userInfo);
}
