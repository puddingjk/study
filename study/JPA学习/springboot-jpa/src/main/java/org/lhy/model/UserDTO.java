package org.lhy.model;//package com.lhy.model;

/**
 * @program: springboot
 * @description:
 * @author: lhy
 * @create: 2019-03-15 10:13
 **/
public class UserDTO extends User{
   private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}