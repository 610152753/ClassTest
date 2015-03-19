package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * 1.һ�������뱻���л�������Ҫʵ��java.io.Serializable�ӿڣ� �ýӿ���û�ж����κη�������һ����ʶ�Խӿ�(Marker
 * Interface), ��һ����ʵ���˸ýӿڣ��ͱ�ʾ�����Ķ����ǿ������л��ġ�
 * 
 * 2.�����л�ʱ��static�������޷����л��ģ����A�����˶�B�����ã� ��ô�����л�A��ʱ��Ҳ�ὫBһ�������л��������ʱA�������л�,B�޷����л�,
 * ��ô�����л�A��ʱ��ͻᷢ���쳣.��ʱ����Ҫ����B��������Ϊtransient, �ùؼ��ֱ�ʾ�������ᱻ���л�.
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
	 * ��������һ�������л�/�����л�������ʵ������������private����(��������Ҫ������ı�����ȫ��һ��)
	 * ��ô���������ǿ��Ը��ӵײ㡢����ϸ���ķ�ʽ�������л�/�����л����̡�
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
