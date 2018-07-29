/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.jesse.server.service.impl;

import com.jesse.server.dao.UserDao;
import com.jesse.server.dao.UserMapper;
import com.jesse.server.domain.User;
import com.jesse.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Auser
 * @version $Id UserService.java, v 0.1 2018-07-24 22:46 Auser Exp $$
 */
@Service
public class UserService implements IUserService{
    @Autowired
    UserDao userDao;
    @Autowired
    UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    //    private final UserMapper userMapper;

//    public UserService(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    public void registerUser(User user) {
        userMapper.insert(user);
    }


    public void login(User user) {


    }

    public void logout(User user) {

    }

    public User getUserInfo(Integer id) {
//        return null;
        return userDao.selectByPrimaryKey(id);
    }

    public void updateteUserInfo(User user) {

    }

    public void updateUserImage() {

    }

}