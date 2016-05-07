package xml.resolve;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import oracle.net.aso.e;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.dom4j.io.SAXReader;

public class SAXReaderDom4j {
	
	public static void main(String[] args) throws Exception {
		
		SAXReader saxreader = new SAXReader();
		
		Document doc = saxreader.read(new File("jdom.xml"));
		
		Element root = doc.getRootElement();
		
		
		System.out.println("root element :" + root.getName());
		
		@SuppressWarnings("rawtypes")
		List childList = root.elements();
		
		System.out.println(childList.size());
		
		Element first = root.element("学生");
		
		System.out.println(first.attributeValue("学号"));
		
		for(@SuppressWarnings("unchecked")
		Iterator<e> iter = root.elementIterator();iter.hasNext();)
		{
			Element e = (Element)iter.next();
			
			System.out.println(" attr:"+ e.attributeValue("学号"));
		}
		
		System.out.println("-----------------------------------");
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		org.w3c.dom.Document document = db.parse(new File("jdom.xml"));
		
		DOMReader domreader = new DOMReader();
		
		//将JAXP的Document转换为DOM4J的Document
		Document d= domreader.read(document);
		
		Element rootelement = d.getRootElement();
		
		System.out.println(rootelement.getName());		
		
	}

}
