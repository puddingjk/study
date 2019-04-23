package org.lhy.controller;

import org.lhy.model.User;
import org.lhy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot-jpa
 * @description: 用户简单操作
 * @author: lhy
 * @create: 2019-04-23 18:31
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public void queryByAll(){
        List<User> list =userService.findListAll();
    }
}