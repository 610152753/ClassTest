package xml.resolve;

import java.io.File;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserFactoryResolvexml {
	
	public static void main(String[] args) throws Exception {
		
		SAXParserFactory spf = SAXParserFactory.newInstance();
		
		SAXParser sp = spf.newSAXParser();
		
		sp.parse(new File("students.xml"),new mydh());
		
	}

}
class mydh extends DefaultHandler
{
	private Stack<String> stack = new Stack<String>();
	
	private String name;
	
	private String age;
	
	private String sex;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		stack.push(qName);
		
		for(int i = 0; i < attributes.getLength(); i ++)
		{
			
			String attrname = attributes.getQName(i);
			String attrvalue = attributes.getValue(i);
			System.out.println("========================");
			System.out.println(attrname + "=" + attrvalue);
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String namet = stack.peek();
		
		if("姓名".equals(namet))
		{
			name = new String(ch,start,length);
		}if("性别".equals(namet)){
			sex = new String(ch,start,length);
		}
		if("年龄".equals(namet))
		{
			age = new String(ch,start,length);
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		stack.pop();
		if("姓名".equals(qName))
		{
		System.out.println(qName + ":" + name);
		}
		if("性别".equals(qName))
		{
			System.out.println(qName + ":" + sex);
		}
		if("年龄".equals(qName))
		{
			System.out.println(qName + ":" + age);
		}
	}
}
