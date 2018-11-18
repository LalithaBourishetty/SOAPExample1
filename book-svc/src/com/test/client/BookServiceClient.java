package com.test.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.test.BookService;
import com.test.beans.Book;
// in the below programe we are using the server code itself. However web services
//just expose WSDL and third party applications don’t have access to these classes.
public class BookServiceClient {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdlUrl = new URL("http://localhost:8888/ws/book?wsdl");
		QName qName= new QName("http://impl.test.com/","BookServiceImplService");
		Service service = Service.create(wsdlUrl, qName);
		
		// need to pass endpoint interface and model beans to client
		
		BookService port = service.getPort(BookService.class);
		Book b1= new Book();b1.setId(1);b1.setName("AAA");b1.setPrice(12f);
		Book b11= new Book();b11.setId(2);b11.setName("BBB");b11.setPrice(14f);
		System.out.println("add book "+port.addBook(b1)); 
		System.out.println("add book "+port.addBook(b11));
		System.out.println("get book  "+port.getBook(1));
        System.out.println("delete book " + port.deleteBook(b1));
		System.out.println( " all books "+Arrays.asList(port.getAllBooks()));
	}

}
