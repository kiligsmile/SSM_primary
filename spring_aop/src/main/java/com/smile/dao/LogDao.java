package com.smile.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    @Insert("insert into tbl_log(info,createdate) values(#{info},now())")
    void log(String info);
}
