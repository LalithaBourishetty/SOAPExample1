package com.test;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.test.beans.Book;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface BookService {
	@WebMethod
	public boolean addBook(Book book);

	@WebMethod
	public boolean deleteBook(Book book);

	@WebMethod
	public Book getBook(int id);

	@WebMethod
	public Book[] getAllBooks();
}
