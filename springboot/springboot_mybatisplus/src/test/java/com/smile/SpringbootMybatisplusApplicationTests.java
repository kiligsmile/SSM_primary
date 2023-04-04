package com.smile;

import com.smile.dao.UserDao;
import com.smile.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisplusApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        List<User> userList=userDao.selectList(null);
        System.out.println(userList);
    }

}
