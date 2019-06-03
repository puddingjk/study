package org.lhy.service;

import org.lhy.dao.UserDao;
import org.lhy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot-jpa
 * @description: 用户逻辑处理层
 * @author: lhy
 * @create: 2019-04-23 18:32
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findListAll() {
        return userDao.findAll();
    }
}