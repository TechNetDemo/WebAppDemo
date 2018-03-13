package com.technet;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class App {
	public static void main(String[] args) throws Exception {
		

		File xmlFile = new File("D:\\eclipse-workspace\\webapp-team1\\data.xml");

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document doc = documentBuilder.parse(xmlFile);
		NodeList list = doc.getElementsByTagName("user");
		
		for (int i=0;i<list.getLength(); i++){

			Node node = list.item(i);
				
			if (node.getNodeType() ==Node.ELEMENT_NODE){
				Element element = (Element) node;
				System.out.println( i+1 + ")The username retrieved from data.xml:" + element.getElementsByTagName("username").item(0).getTextContent());
				System.out.println( "  Information:" + element.getElementsByTagName("info").item(0).getTextContent());
			}
		}
	

	}	
}
