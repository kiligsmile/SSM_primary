package com.smile;

import com.smile.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {
	@Autowired
	private BookService bookService;

	@Test
	public void save(){
		bookService.save();
	}

}
