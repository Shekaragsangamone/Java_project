package com.xml.java.practice;

import java.io.File;

import javax.xml.bind.JAXBContext;
public class JAXBExample {

	public static void main (String []args) {

		Customer customer=new Customer();
		customer.setId(10);
		customer.setName("John");
		customer.setAge(20);


		try {
			File file=new File("Jaxb.xml");
			JAXBContext jaxbContext	=	JAXBContext.newInstance(Customer.class);

		}catch(Exception e){


		}

	}

}
