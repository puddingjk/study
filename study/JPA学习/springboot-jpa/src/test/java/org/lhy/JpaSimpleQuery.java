package org.lhy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lhy.dao.UserDao;
import org.lhy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * @program: springboot-jpa
 * @description: JPA简单查询
 * @author: lhy
 * @create: 2019-04-23 18:47
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaSimpleQuery {

    @Autowired
    private UserDao userDao;

    /**
     * JpaRepository的查询方法
     */
    @Test
    public void query(){
        //查询所有
        User user=new User();

//        List<User> ulist = userDao.findAll();
//        System.out.println(ulist.size());

        long count = userDao.count();
//        User zhangsan = userDao.save(new User("zhangsan", "233"));
        Optional<User> byId = userDao.findById(2);

        System.out.println(byId.get());
//        userDao.save(user);
//        userDao.delete(user);
//        userDao.count();
    }
}