package com.test.impl;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

import javax.jws.WebService;

import com.test.BookService;
import com.test.beans.Book;

@WebService(endpointInterface="com.test.BookService")
public class BookServiceImpl implements BookService {

	private Map<Integer,Book> bookMap=new HashMap<>();
	
	@Override
	public boolean addBook(Book book) {
		if(bookMap.get(book.getId()) != null)
		return false;
		
		bookMap.put(book.getId(), book);
		return true;
	}

	@Override
	public boolean deleteBook(Book book) {
		if(bookMap.get(book.getId()) == null)
		return false;
		
		bookMap.remove(book.getId());
		return true;
	}

	@Override
	public Book getBook(int id) {
		return bookMap.get(id);
	}

	@Override
	public Book[] getAllBooks() {
		Set<Integer> idSet=bookMap.keySet();
		Book[] book= new Book[idSet.size()];
		int i=0;
		for (int set : idSet) {
			book[i] = bookMap.get(set);
		i++;
		}
		return book;
	}

}
