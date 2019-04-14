package org.lhy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lhy.dao.UserDTO;
import org.lhy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testQuery() throws Exception {
//        List<User> users = userMaper.queryAllList();
//        users.stream().forEach(x->
//        System.out.println(x.toString()));
//        Optional<User> id = userDao.findOne(new Specification<User>() {
//            @Override
//            public Predicate toPredicate(Root<User> root,
//                                         CriteriaQuery<?> query, CriteriaBuilder cb) {
//
//                Path path = root.get("id");
//                Predicate predicate = cb.gt(path, 16);
//                return predicate;
//            }
//        });
//       id.ifPresent(x-> System.out.println(x));
    }

    /**
     * JPA 连表分页查询 HQL方式
     * @throws Exception
     */
    @Test
    public void testQuer1y() {
        /**
         * PageRequest.of(1,5,Sort.Direction.ASC,"name")
         * 1代表 第几页
         * 5：每页大小
         * Sort.Direction.ASC,"name" 排序字段
         */
        Page<UserDTO> byCity = userDao.findByCity(PageRequest.of(1,5,Sort.Direction.ASC,"name"));
        userDao.findOne (new Specification);
//        List<UserDTO> byCity = userDao.findByCity();
        List<UserDTO> content = byCity.getContent();
        System.out.println("总页数:"+byCity.getTotalPages());
        System.out.println("总记录数:"+byCity.getTotalElements());
//        byCity.stream().forEach(x -> System.out.println(x.getUser().getName()));
    }


}
