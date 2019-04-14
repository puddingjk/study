package org.lhy.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: springboot
 * @description: 用户
 * @author: lhy
 * @create: 2019-02-22 17:28
 **/
@Entity
@Table(name="lhy_admin")
public class User implements Serializable {

    private Integer id;
    private String name;
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "pwd")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}