package com.smile.dao.impl;

import com.smile.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    public boolean readResources(String url,String password){
        System.out.println(password.length());
        return password.equals("root");
    }
}
