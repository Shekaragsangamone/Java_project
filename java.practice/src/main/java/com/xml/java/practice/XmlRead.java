package com.xml.java.practice;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.Document;

public class XmlRead {

	public static void main(String args[]) {
		try {


			File xmlFile=new File("file.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);


			String name=doc.getDocumentElement().getNodeName();

			int attribute=Node.ATTRIBUTE_NODE; 			
			String firstName= doc.getElementsByTagName("firstname").item(0).getTextContent();
			String lastName=doc.getElementsByTagName("lastname").item(0).getTextContent();
			String nickName=doc.getElementsByTagName("nickname").item(0).getTextContent();
			String salary= doc.getElementsByTagName("salary").item(0).getTextContent();


			System.out.println("Root element :" + name);
			System.out.println("Staff id : " + attribute);
			System.out.println("First Name : " + firstName  );
			System.out.println("Last Name : " + lastName);
			System.out.println("Nick Name : " +  nickName);
			System.out.println("Salary : " + salary);





		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
