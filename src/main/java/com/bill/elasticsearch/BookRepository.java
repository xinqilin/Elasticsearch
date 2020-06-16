package com.bill.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bill.elasticsearch.bean.Book;

public interface BookRepository extends ElasticsearchRepository<Book,Integer>{
	
	public List<Book> findBookByName(String bookName);

}
