package com.smile.service.impl;

import com.smile.dao.AccountDao;
import com.smile.domain.Account;
import com.smile.service.AccountService;
import com.smile.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void save(Account account){
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Integer id){
        accountDao.delete(id);
    }

    public Account findById(Integer id){
        return accountDao.findById(id);
    }

    public List<Account> findAll(){
        return accountDao.findAll();
    }

    @Transactional
    public void  transfer(String out,String in,Double money){
        try {
            accountDao.outMoney(out,money);
            int i=1/0;
            accountDao.inMoney(in,money);

        }finally {
            logService.log(out,in,money);
        }


    }
}
