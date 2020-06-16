package com.bill.elasticsearch;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bill.elasticsearch.bean.Book;

import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;



//for Jest
@SpringBootTest
class ElasticsearchApplicationTests {

	@Autowired
	JestClient jestClient;
	
	
	@Test
	void contextLoads() {
		Book book=new Book();
		book.setId(1);
		book.setAuthor("Bill");
		book.setTitle("BillAndES");
		book.setContent("veryGood");
		
		Index index=new Index.Builder(book).index("bill").type("news").build();
		
		try {
			jestClient.execute(index);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//搜索
	@Test
	public void search() {
		
		String json="要搜索的json，官網有";
		Search search=new Search.Builder(json).addIndex("bill").addType("news").build();
		
		try {
			SearchResult res=jestClient.execute(search);
			System.out.println(res.getJsonString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
