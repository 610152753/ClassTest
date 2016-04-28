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
		//Step 1:���dom����������(���������������ڴ�������Ľ�����)
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//Step 2:��þ���Ľ�����
		DocumentBuilder db = dbf.newDocumentBuilder();
		//Step 3:����һ��xml�ļ������Document����(���ڵ�)
		Document document = db.parse(new File("students.xml"));
		
		NodeList nodeList = document.getElementsByTagName("ѧ��");
		
		for(int i= 0 ;i < nodeList.getLength();i++)
		{

			Element element = (Element)nodeList.item(i);
			
			String content= element.getElementsByTagName("����").item(0).getFirstChild().getNodeValue();
			
			System.out.println("������" + content);
			
			content = element.getElementsByTagName("�Ա�").item(0).getFirstChild().getNodeValue();
			
			System.out.println("�Ա�" + content);
			
			content = element.getElementsByTagName("����").item(0).getFirstChild().getNodeValue();
			
			System.out.println("���䣺" + content);
		}
	}

}
