package org.lhy.model.dto;

import org.lhy.model.User;

public interface UserDTO {
    /**
     * 获取用户对象
     * @return
     */
    User getUser();

    /**
     * 获取用户名称
     * @return
     */
    String getName();

}
