package com.bill.elasticsearch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bill.elasticsearch.bean.Book;

@SpringBootTest
public class SpringDataESTest {

	
	@Autowired
	BookRepository bookRepository;
	
	@Test
	public void test() {
		
		Book book=new Book();
		bookRepository.index(book);
	}
}
