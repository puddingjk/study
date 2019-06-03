package org.lhy.model;//package com.lhy.model;

import javax.persistence.*;

/**
 * @program: springboot
 * @description:
 * @author: lhy
 * @create: 2019-03-14 18:29
 **/
@Entity
@Table(name="sys_dept")
public class Dept {
    private Integer id;
    private Integer userId;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}