package xml.resolve;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DocumentBuilderFactoryTest {
	
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException
	{
		//Step 1:获得dom解析器工厂(工作的作用是用于创建具体的解析器)
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//Step 2:获得具体的解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		//Step 3:解析一个xml文件，获得Document对象(根节点)
		Document document = db.parse(new File("students.xml"));
		
		NodeList nodeList = document.getElementsByTagName("学生");
		
		for(int i= 0 ;i < nodeList.getLength();i++)
		{

			Element element = (Element)nodeList.item(i);
			
			String content= element.getElementsByTagName("姓名").item(0).getFirstChild().getNodeValue();
			
			System.out.println("姓名：" + content);
			
			content = element.getElementsByTagName("性别").item(0).getFirstChild().getNodeValue();
			
			System.out.println("性别：" + content);
			
			content = element.getElementsByTagName("年龄").item(0).getFirstChild().getNodeValue();
			
			System.out.println("年龄：" + content);
		}
	}

}
