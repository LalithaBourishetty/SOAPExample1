package com.test.publish;

import javax.xml.ws.Endpoint;

import com.test.impl.BookServiceImpl;

public class SOAPPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ws/book", new BookServiceImpl()); 
	}

}
