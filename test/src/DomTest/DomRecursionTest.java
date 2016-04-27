package DomTest;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomRecursionTest {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse(new File("students.xml"));
		
		Element root = doc.getDocumentElement();
		
	    recursionElement(root);	
		
	}
	public static void recursionElement(Element element)
	{
		
		String elementname = element.getNodeName();
		
         System.out.print("<" + elementname);
         
         NamedNodeMap nnm = element.getAttributes();
         
         if(null != nnm)
         {
        	 for(int i = 0 ; i < nnm.getLength(); i ++)
        	 {
        		 Attr attr = (Attr)nnm.item(i);
        		 
        		 String attrname = attr.getName();
        		 
        		 String attrvalue = attr.getValue();
        		 
        		 System.out.print(" " + attrname + "=\"" + attrvalue +"\"");
        	 }
         }
         
         System.out.print(">");
         
         NodeList nl = element.getChildNodes();
         
         for(int i = 0 ; i < nl.getLength(); i ++)
         {
        	 short nodetype = nl.item(i).getNodeType();
        	 if(nodetype == Node.ELEMENT_NODE)
        	 {
        		 //递归入口
        		 recursionElement((Element)nl.item(i));
        	 }
        	 //退出口
        	 if(nodetype == Node.TEXT_NODE)
        	 {
        		 System.out.print(nl.item(i).getNodeValue());
        	 }
        	 if(nodetype == Node.COMMENT_NODE)
        	 {
        		 Comment comment = (Comment)nl.item(i);
        		 
        		 System.out.print("<!--" + comment.getData() + "-->");
        	 }
         }
         System.out.print("</" + elementname + ">");		
	}
}
