package xml.resolve;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserFactoryTest {
	
	public static void main(String[] args) throws Exception
	{
		//STEP 1:获得SAX分析器工厂实例
		SAXParserFactory sapxf = SAXParserFactory.newInstance();
		//STEP 2:获得SAX分析器
		SAXParser saxparser = sapxf.newSAXParser();
		//STEP 3:开始解析xml文件
		saxparser.parse(new File("students.xml"),new myhandler());
	}

}
class myhandler extends DefaultHandler
{
	@Override
	public void startDocument() throws SAXException {
       System.out.println("start Document");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("==start Element");
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("==end Element");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("end Document");
	}
	
}