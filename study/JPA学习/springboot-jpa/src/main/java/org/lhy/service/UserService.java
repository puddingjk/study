package org.lhy.service;

import org.lhy.model.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<User> findListAll();
}
