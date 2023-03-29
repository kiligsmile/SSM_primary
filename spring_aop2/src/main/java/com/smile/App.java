package com.smile;

import com.smile.config.SpringConfig;
import com.smile.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main (String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao=context.getBean(BookDao.class);
        String name=bookDao.findName(100,"smile");
        System.out.println(name);
    }
}
