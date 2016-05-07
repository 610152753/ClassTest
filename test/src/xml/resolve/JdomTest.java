package xml.resolve;

import java.io.FileOutputStream;

import org.jdom.Attribute;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class JdomTest {
	
	
	 public static void main(String[] args) throws Exception {
		
		 Document document = new Document();
		 
		 //同时修改多个变量 Alt + shift + r
		 Element root = new Element("学生手册");
		 
		 document.addContent(root);
		 
		 Attribute attr = new Attribute("班级","2");
		 
		 Element student = new Element("学生").setAttribute("学号", "1").setAttribute(attr);
		 
		 Comment comment = new Comment("这是学生手册的XML");

		 root.addContent(comment);
		 //方法链的编程风格， 可以set后返回的是对象本身 可以实现多次set
		 
		 root.addContent(student);

		student.addContent(new Element("姓名").setText("张三")).addContent(new Element("性别").setText("女"))
				.addContent(new Element("地址").setText("北京市海淀区")).addContent(new Element("年龄").setText("20"));
		 
		 //XMl输出格式的控制
		 Format format = Format.getPrettyFormat();
		 
		 format.setEncoding("gbk");
		 //输入到文件
		 XMLOutputter out = new XMLOutputter();
		 
		 out.setFormat(format);
		 
		 out.output(document, new FileOutputStream("jdom.xml"));
		 //out.output(document, new FileWriter("jdom.xml"));
		 
	}

}
