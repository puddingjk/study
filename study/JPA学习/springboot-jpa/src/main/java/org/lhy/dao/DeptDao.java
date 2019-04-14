package org.lhy.dao;//package com.lhy.dao;

import org.lhy.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springboot
 * @description:
 * @author: lhy
 * @create: 2019-03-14 18:31
 **/
public interface DeptDao extends JpaRepository<Dept, Integer> {
}