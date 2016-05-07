package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * 1.一个类若想被序列化，则需要实现java.io.Serializable接口， 该接口中没有定义任何方法，是一个标识性接口(Marker
 * Interface), 当一个类实现了该接口，就表示这个类的对象是可以序列化的。
 * 
 * 2.在序列化时，static变量是无法序列化的；如果A包含了对B的引用， 那么在序列化A的时候也会将B一并地序列化；如果此时A可以序列化,B无法序列化,
 * 那么当序列化A的时候就会发生异常.这时候需要将对B的引用设为transient, 该关键字表示变量不会被序列化.
 * 
 * @author Joe
 *
 */
public class SerializableTest2 {

	public static void main(String[] args) throws Exception {

		Person2 p1 = new Person2(10, "zhaoxing", 10.2);
		Person2 p2 = new Person2(5, "LiMing", 13.2);
		Person2 p3 = new Person2(6, "Zhang", 9.2);

		FileOutputStream fos = new FileOutputStream("SerializableOut.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);

		oos.close();

		System.out.println("---------------------------");

		FileInputStream fis = new FileInputStream("SerializableOut.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Person2 p4 = null;

		for (int i = 0; i < 3; i++) {
			p4 = (Person2) ois.readObject();

			System.out.println(p4.id + ", " + p4.Name + ", " + p4.height);
		}

		ois.close();

		System.out.println("---------------------------");

	}

}

class Person2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int id;
	transient String Name;
	Double height;

	public Person2(int id, String Name, Double height) {
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

	/**
	 * 
	 * 当我们在一个待序列化/反序列化的类中实现了下面两个private方法(方法声明要与下面的保持完全的一致)
	 * 那么就允许我们可以更加底层、更加细粒的方式控制序列化/反序列化过程。
	 * 
	 */
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.writeInt(id);
		out.writeUTF(Name);
		System.out.println("write Object");
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		Name = in.readUTF();
		System.out.println("read Object");
	}
}
