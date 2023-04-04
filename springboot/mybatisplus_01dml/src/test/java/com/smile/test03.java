package com.smile;

import com.smile.dao.UserDao;
import com.smile.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test03 {
    @Autowired
    private UserDao userDao;
    @Test
    void testUpdate(){
//        User user=new User();
//        user.setId(3L);
//        user.setName("jason");
////        user.setVersion(1);
//        userDao.updateById(user);

        User user=userDao.selectById(3L);
        user.setName("xiaotianshi");
        userDao.updateById(user);
    }
}
