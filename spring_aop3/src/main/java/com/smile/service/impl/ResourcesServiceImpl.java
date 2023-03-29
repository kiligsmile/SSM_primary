package com.smile.service.impl;

import com.smile.dao.ResourcesDao;
import com.smile.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesDao resourcesDao;
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
}
