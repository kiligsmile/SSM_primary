package com.smile.service;

import com.smile.domain.Account;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    void save(Account account);
    void delete(Integer id);
    void update(Account account);
    List<Account> findAll();
    Account findById(Integer id);

    public void transfer(String out,String in,Double money) throws IOException;
}
