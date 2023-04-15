package com.smile.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.smile.entity.User;
import com.smile.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private UserService userService;

//    CachePut:将方法返回值放入缓存
//    value：缓存的名称，每个缓存名称下面可以有多个key
//    key：缓存的key
    @CachePut(value = "userCache",key = "#result.id")
    @PostMapping
    public User save(User user){
        userService.save(user);
        return user;
    }
    @CacheEvict(value = "userCache",key = "#p0")
//    @CacheEvict(value = "userCache",key = "#root.args[0]")  效果相同
//    @CacheEvict(value = "userCache",key = "#id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.removeById(id);
    }

    @CacheEvict(value = "userCache",key = "#user.id")
    @PutMapping
    public User update(User user){
        userService.updateById(user);
        return user;
    }

//    condition：满足条件时才缓存数据
//    @Cacheable(value = "userCache",key = "#id",condition = "#result!=null")
    @Cacheable(value = "userCache",key = "#id",unless = "#result==null")
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        User user=userService.getById(id);
        return user;
    }

    @Cacheable(value = "userCache",key = "#user.id+'_'+#user.name")
    @GetMapping("/list")
    public List<User> list(User user){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(user.getId() != null,User::getId,user.getId());
        queryWrapper.eq(user.getName() != null,User::getName,user.getName());
        List<User> list = userService.list(queryWrapper);
        return list;
    }
}
