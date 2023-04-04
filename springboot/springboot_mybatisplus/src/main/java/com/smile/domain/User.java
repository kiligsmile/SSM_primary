package com.smile.domain;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
}

