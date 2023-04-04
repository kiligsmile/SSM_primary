package com.smile.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
//@TableName("tbl_user")
public class User {
//    @TableId(type = IdType.AUTO)
    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;
    private String name;
    @TableField(select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)
    private Integer online;
    private Integer deleted;
    @Version
    private Integer version;
}
