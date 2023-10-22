package com.api.book.controllers.entities.services;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.controllers.entities.Book;

@Component
public class BookServices {

	private static List<Book> list  = new ArrayList<Book>();
		
	static {
		list.add(new Book(12,"Java complete refrence","XYZ"));
		list.add(new Book(13,"Head first java","ABC"));
		list.add(new Book(10,"Thing in java","PQR"));
	}
	
//	get all books
	public List<Book> getAllBooks(){
		return list;
	}
 	
//	get book by id
	public Book getBookById(int id) {
		Book book = null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
//	adding the book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}

//	delete book by Id
	public void deleteBook(int bookId) {
		list=list.stream().filter(Book -> Book.getId()!=bookId).collect(Collectors.toList());
	}
	
	
}
