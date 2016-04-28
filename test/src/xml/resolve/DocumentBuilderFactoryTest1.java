package xml.resolve;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DocumentBuilderFactoryTest1 {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder  db = dbf.newDocumentBuilder();
		
		Document document = db.parse(new File("students.xml"));
		
		System.out.println(document.getXmlEncoding());
		
		System.out.println(document.getXmlStandalone());
		
		System.out.println(document.getXmlVersion());
 		
		System.out.println("=============================");
		
		Element element = document.getDocumentElement();
		
		System.out.println(element.getChildNodes().getLength());
		
		System.out.println("==========================");
		
		NodeList nl = element.getChildNodes();
		
		for(int i = 0; i < nl.getLength(); i ++)
		{
			System.out.println("Node Number:" + i);
			System.out.println("["+nl.item(i).getNodeName()+ "]");
			System.out.println("["+nl.item(i).getNodeValue()+ "]");
			System.out.println("=========================");
		}
		
		System.out.println("###################################");
        for(int i = 0 ;i < nl.getLength(); i ++)
        {
        	Node node = nl.item(i);
        	
        	System.out.println(node.getNodeType() + ":" + node.getNodeValue());
        }
		System.out.println("----------------------------------------------");
		
		for(int i =0; i <nl.getLength(); i++)
		{
			Node node = nl.item(i);
			
			System.out.println(node.getTextContent());
		}
		
		System.out.println("=====================");
		
		NodeList nodelist = document.getElementsByTagName("Ñ§Éú");
		
		for(int i = 0; i <nodelist.getLength(); i++)
		{
			NamedNodeMap nnm = nodelist.item(i).getAttributes();
			
			String attrname = nnm.item(0).getNodeName();
			
			System.out.println("======================");
			
			System.out.print(attrname);
			
			String attrvalue = nnm.item(0).getNodeValue();
			
			System.out.println(attrvalue);
		}
		
		
	}

}
