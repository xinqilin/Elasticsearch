package com.bill.elasticsearch.bean;

import org.springframework.data.elasticsearch.annotations.Document;

import io.searchbox.annotations.JestId;


@Document(indexName="bill",type="book")
public class Book {
	
//	@JestId
	private Integer id;
	private String author;
	private String title;
	private String content;
	public Book(Integer id, String author, String title, String content) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.content = content;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", content=" + content + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
