package xml.resolve;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class SAXBuilderJdom {
	
	public static void main(String[] args) throws Exception {
		
		SAXBuilder sb = new SAXBuilder();
		
		Document doc = sb.build(new File("jdom.xml"));
		
		Element element = doc.getRootElement();
		
		System.out.println(element.getName());
		
		Element student = element.getChild("Ñ§Éú");
		
		System.out.println(student.getText());
		
		@SuppressWarnings("rawtypes")
		List list = student.getAttributes();
		
		for(Object a:list)
		{
			System.out.print(((Attribute)a).getName() + "=");
			System.out.println(((Attribute)a).getValue());
		}
		
		student.removeChild("µØÖ·");
		
		XMLOutputter out = new XMLOutputter();
		
		out.setFormat(Format.getPrettyFormat());
		
		out.output(element, new FileOutputStream("jdom1.xml"));
		
	}

}
