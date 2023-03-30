package com.smile.Service.impl;

import com.smile.Service.UserService;
import com.smile.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void save(User user){
        System.out.println("user service...");
    }
}
