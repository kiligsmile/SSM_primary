package com.smile.dao.impl;

import com.smile.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public String findName(int id,String password){
        System.out.println("id:"+id);
        if(true){
            throw new NullPointerException();
        }
        return "smile";
    }
}
