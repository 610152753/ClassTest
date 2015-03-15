package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * 1.一个类若想被序列化，则需要实现java.io.Serializable接口，
 *  该接口中没有定义任何方法，是一个标识性接口(Marker Interface),
 *  当一个类实现了该接口，就表示这个类的对象是可以序列化的。
 * 
 * 2.在序列化时，static变量是无法序列化的；如果A包含了对B的引用，
 *  那么在序列化A的时候也会将B一并地序列化；如果此时A可以序列化,B无法序列化,
 *  那么当序列化A的时候就会发生异常.这时候需要将对B的引用设为transient,
 *  该关键字表示变量不会被序列化.
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
