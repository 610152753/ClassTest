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
		 
		 //ͬʱ�޸Ķ������ Alt + shift + r
		 Element root = new Element("ѧ���ֲ�");
		 
		 document.addContent(root);
		 
		 Attribute attr = new Attribute("�༶","2");
		 
		 Element student = new Element("ѧ��").setAttribute("ѧ��", "1").setAttribute(attr);
		 
		 Comment comment = new Comment("����ѧ���ֲ��XML");

		 root.addContent(comment);
		 //�������ı�̷�� ����set�󷵻ص��Ƕ����� ����ʵ�ֶ��set
		 
		 root.addContent(student);

		student.addContent(new Element("����").setText("����")).addContent(new Element("�Ա�").setText("Ů"))
				.addContent(new Element("��ַ").setText("�����к�����")).addContent(new Element("����").setText("20"));
		 
		 //XMl�����ʽ�Ŀ���
		 Format format = Format.getPrettyFormat();
		 
		 format.setEncoding("gbk");
		 //���뵽�ļ�
		 XMLOutputter out = new XMLOutputter();
		 
		 out.setFormat(format);
		 
		 out.output(document, new FileOutputStream("jdom.xml"));
		 //out.output(document, new FileWriter("jdom.xml"));
		 
	}

}
