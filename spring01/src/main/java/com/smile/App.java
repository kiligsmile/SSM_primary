package com.smile;
import com.smile.config.SpringConfig;
import com.smile.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] arg) throws IOException {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao=context.getBean(BookDao.class);
        bookDao.save();
    }
}
