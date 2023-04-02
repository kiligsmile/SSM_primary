package com.smile.service;

import com.smile.mapper.UserMapper;
import com.smile.pojo.User;
import com.smile.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    SqlSessionFactory factory=SqlSessionFactoryUtils.getSqlSessionFactory();
    public User login(String username,String password){
        SqlSession sqlSession=factory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.select(username, password);
        sqlSession.close();
        return user;
    }
}
