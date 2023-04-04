package com.smile;

import com.smile.dao.UserDao;
import com.smile.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test02 {
    @Autowired
    private UserDao userDao;

    @Test
    void testsave(){
        User user=new User();
        user.setName("小天使");
        user.setPassword("smile111");
        user.setAge(5);
        user.setTel("34687532111");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
        userDao.deleteById(1L);
    }

    @Test
    void testFind(){
        System.out.println(userDao.selectList(null));
    }

    @Test
    void testUpdate(){
//        User user=new User();
//        user.setId(3L);
//        user.setName("jason111");
//        user.setVersion(1);
//        userDao.updateById(user);

        User user=userDao.selectById(3L);
        User user1=userDao.selectById(3L);
        user1.setName("angle222");
        user.setName("xiaotianshi11" );
        userDao.updateById(user1);
        userDao.updateById(user);

    }
}
