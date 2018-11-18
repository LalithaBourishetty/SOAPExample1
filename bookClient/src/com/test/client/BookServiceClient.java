package com.test.client;

import java.util.Arrays;

import com.test.Book;
import com.test.impl.BookService;
import com.test.impl.BookServiceImplService;

public class BookServiceClient {

	public static void main(String[] args) {
		BookServiceImplService service = new BookServiceImplService();
		BookService port = service.getBookServiceImplPort();
		Book b1= new Book();b1.setId(1);b1.setName("AAA");b1.setPrice(12f);
		Book b11= new Book();b11.setId(2);b11.setName("BBB");b11.setPrice(14f);
		System.out.println("add book "+port.addBook(b11)); 
		System.out.println("add book "+port.addBook(b1));
		System.out.println("get book  "+port.getBook(2));
        System.out.println("delete book " + port.deleteBook(b11));
		System.out.println( " all books "+Arrays.asList(port.getAllBooks()));
	}

}
