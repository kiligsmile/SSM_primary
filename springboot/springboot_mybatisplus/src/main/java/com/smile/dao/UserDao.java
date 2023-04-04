package com.smile.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smile.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
