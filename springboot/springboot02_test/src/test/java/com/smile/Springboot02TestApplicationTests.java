package com.smile;

import com.smile.dao.BookDao;
import com.smile.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02TestApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        Book book=bookDao.getById(1);
        System.out.println(book);
    }

}
