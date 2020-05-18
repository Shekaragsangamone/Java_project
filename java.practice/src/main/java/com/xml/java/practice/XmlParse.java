package com.xml.java.practice;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
public class XmlParse {
	public static void main(String args[]) throws SAXException, IOException, XPathExpressionException {

		try {
			File file=new File("file.xml");

			DocumentBuilderFactory	dbFactory =DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder=dbFactory.newDocumentBuilder();
			Document doc=docBuilder.parse(file);
			XPath xpath=XPathFactory.newInstance().newXPath();

			String expression="/company/staff/";
			NodeList nodeList=(NodeList) xpath.compile(expression).evaluate(doc,XPathConstants.NODESET);
				for(int i=0;i<nodeList.getLength();i++) {
					Node node=nodeList.item(i);
					System.out.println("Current element:"+node.getNodeName());
					if(node.getNodeType()== Node.ELEMENT_NODE) {
				Element element=		(Element)node;
				System.out.println("Id"+element.getAttribute("id"));
				System.out.println("FirstName:"+element.getElementsByTagName("firstName").item(0).getTextContent());
				System.out.println("lastName:"+element.getElementsByTagName("lastName").item(0).getTextContent());
				System.out.println("nickName:"+element.getElementsByTagName("nickName").item(0).getTextContent());
				System.out.println("salary:"+element.getElementsByTagName("salary").item(0).getTextContent());
				
					}
					
				}

		
		}catch(Exception e){
			e.printStackTrace();
		}


	}

}
