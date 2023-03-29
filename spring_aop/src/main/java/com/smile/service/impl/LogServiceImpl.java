package com.smile.service.impl;

import com.smile.dao.LogDao;
import com.smile.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void log(String out,String in,Double money){
        logDao.log("转账操作由"+out+"到"+in+"，金额："+money);
    }
}
