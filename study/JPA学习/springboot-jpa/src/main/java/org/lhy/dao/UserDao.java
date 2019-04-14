package org.lhy.dao;


import org.lhy.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author lhy
 */

public interface UserDao extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User> {
    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    User findUserById(Integer id);

    @Query("select u as user,d.name as name from User u left  join Dept d on u.id =d.userId ")
    Page<UserDTO> findByCity(Pageable pageable);

    /**
     *
     */
    @Query("select u as user,d.name as name from User u left  join Dept d on u.id =d.userId where u.id =(select a.id from User a where a.id=1)")
//    @Query(value = "SELECT a from"+
//            " (l.name from User l) a ")
    List<UserDTO> findByCity();



}
