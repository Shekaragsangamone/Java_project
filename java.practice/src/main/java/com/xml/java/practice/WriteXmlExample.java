package com.xml.java.practice;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class WriteXmlExample {
	
	public static void main (String args[]) {
	try {	
		DocumentBuilderFactory	dbFactory=DocumentBuilderFactory.newInstance();
	
		DocumentBuilder	dbBuilder=dbFactory.newDocumentBuilder();
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	

}
