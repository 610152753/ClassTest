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
		
//		//�����ĵ��������ĵ��ĸ�Ԫ�أ���һ�ַ�ʽ
//		
//		Document document = DocumentHelper.createDocument();
//		
//		Element root = DocumentHelper.createElement("ѧ���ֲ�");
//		
//		document.setRootElement(root);
		
		//�����ĵ��������ĵ��ĸ�Ԫ��:�ڶ��ַ�ʽ
		
		Element root = DocumentHelper.createElement("ѧ���ֲ�");
		Document document = DocumentHelper.createDocument(root);
		
		Element student = DocumentHelper.createElement("ѧ��");
		
		root.add(student);
		
		student.addAttribute("ѧ��", "1");
		
		
		Element name = student.addElement("����");
		Element sex =  student.addElement("�Ա�");
		
		name.addText("����");
		sex.addText("Ů");
		
		XMLWriter xmlw = new XMLWriter();
		
		xmlw.write(document);
		
		OutputFormat format = new OutputFormat("  ",true,"gbk");
		
		//FileWriterҲ����ʹ��
		XMLWriter xmlw1 = new XMLWriter(new FileOutputStream(new File("dom4j.xml")),format);
		
		xmlw1.write(document);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
