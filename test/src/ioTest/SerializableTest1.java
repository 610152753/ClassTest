package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * 1.һ�������뱻���л�������Ҫʵ��java.io.Serializable�ӿڣ�
 *  �ýӿ���û�ж����κη�������һ����ʶ�Խӿ�(Marker Interface),
 *  ��һ����ʵ���˸ýӿڣ��ͱ�ʾ�����Ķ����ǿ������л��ġ�
 * 
 * 2.�����л�ʱ��static�������޷����л��ģ����A�����˶�B�����ã�
 *  ��ô�����л�A��ʱ��Ҳ�ὫBһ�������л��������ʱA�������л�,B�޷����л�,
 *  ��ô�����л�A��ʱ��ͻᷢ���쳣.��ʱ����Ҫ����B��������Ϊtransient,
 *  �ùؼ��ֱ�ʾ�������ᱻ���л�.
 * 
 * @author Joe
 *
 */
public class SerializableTest1 {
	
	
	public static void main(String[] args) throws Exception {
		
		Person1 p1 = new Person1(10, "zhaoxing", 10.2);
		Person1 p2 = new Person1(5, "LiMing", 13.2);
		Person1 p3 = new Person1(6, "Zhang", 9.2);
		
		FileOutputStream fos = new FileOutputStream("SerializableOut.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
		
		System.out.println("---------------------------");
		
		FileInputStream fis = new FileInputStream("SerializableOut.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person1  p4 = null;
		
		for(int i = 0 ;i < 3 ; i++)
		{
			p4 = (Person1) ois.readObject();
			
			System.out.println(p4.id + ", " + p4.Name + ", " + p4.height);
		}

		ois.close();
		
		System.out.println("---------------------------");
		
	}

}

class Person1 implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	int id;
	transient String Name;
	Double height;
	
	public Person1 (int id,String Name,Double height)
	{
		this.id = id;
		this.Name = Name;
		this.height = height;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
}
