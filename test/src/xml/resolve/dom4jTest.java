package xml.resolve;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class dom4jTest {
	public static void main(String[] args) throws IOException {
		
//		//创建文档并设置文档的根元素：第一种方式
//		
//		Document document = DocumentHelper.createDocument();
//		
//		Element root = DocumentHelper.createElement("学生手册");
//		
//		document.setRootElement(root);
		
		//创建文档并设置文档的根元素:第二种方式
		
		Element root = DocumentHelper.createElement("学生手册");
		Document document = DocumentHelper.createDocument(root);
		
		Element student = DocumentHelper.createElement("学生");
		
		root.add(student);
		
		student.addAttribute("学号", "1");
		
		
		Element name = student.addElement("姓名");
		Element sex =  student.addElement("性别");
		
		name.addText("张三");
		sex.addText("女");
		
		XMLWriter xmlw = new XMLWriter();
		
		xmlw.write(document);
		
		OutputFormat format = new OutputFormat("  ",true,"gbk");
		
		//FileWriter也可以使用
		XMLWriter xmlw1 = new XMLWriter(new FileOutputStream(new File("dom4j.xml")),format);
		
		xmlw1.write(document);

	}

}
