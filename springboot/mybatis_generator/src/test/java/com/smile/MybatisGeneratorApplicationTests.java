package com.smile;

import cn.angel.domain.User;
import cn.angel.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisGeneratorApplicationTests {
    private IUserService userService;
    @Test
    void testFindAll() {
        List<User> list=userService.list();
        System.out.println(list);
    }

}
