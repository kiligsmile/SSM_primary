package com.smile;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.smile.dao.UserDao;
import com.smile.domain.User;
import com.smile.domain.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class Mybatisplus02DqlApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll(){
//        UserQuery userQuery=new UserQuery();
//        userQuery.setAge(10);
//        userQuery.setAge2(30);
//        LambdaQueryWrapper<User> lambdaQueryWrapper=new  LambdaQueryWrapper<User>();
//
//        lambdaQueryWrapper.lt(null!=userQuery.getAge2(), User::getAge,userQuery.getAge2());
//        lambdaQueryWrapper.gt(null!=userQuery.getAge(), User::getAge,userQuery.getAge());
//        List<User> userList=userDao.selectList(lambdaQueryWrapper);
//        System.out.println(userList);

//        LambdaQueryWrapper<User> lambdaQueryWrapper=new  LambdaQueryWrapper<User>();
//        lambdaQueryWrapper.select(User::getId,User::getName,User::getAge);
//        List<User> userList=userDao.selectList(lambdaQueryWrapper);
//        System.out.println(userList);

        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.select("count(*) as count,tel");
        queryWrapper.groupBy("tel");
        List<Map<String,Object>> list=userDao.selectMaps(queryWrapper);
        System.out.println(list);

    }
}
