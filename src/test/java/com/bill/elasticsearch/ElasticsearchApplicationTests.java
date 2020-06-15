package com.bill.elasticsearch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.searchbox.client.JestClient;

@SpringBootTest
class ElasticsearchApplicationTests {

	@Autowired
	JestClient jsClient;
	
	
	@Test
	void contextLoads() {
	}

}
