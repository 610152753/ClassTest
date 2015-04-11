package cloneTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest3 {
	
	public static void main(String args[]) throws Exception
	{
		Teacher1 t1 = new Teacher1();
		
		t1.setAge(50);
		t1.setName("Hang Zhou");
		
		Students1 s1 = new Students1();
		
		s1.setAge(19);
		s1.setName("Zhang Linag");
		s1.setTeacher1(t1);
		
		Students1 s2 = (Students1)s1.deepCopy();
		
		System.out.println("Students :" + s2.getAge());
		System.out.println("Students :" + s2.getName());
		
		System.out.println("Teacher :" + s2.getTeacher1().getAge());
		System.out.println("Teacher :" + s2.getTeacher1().getName());
		
		System.out.println("---------------------------------------");
		
		t1.setName("Joe");
		s1.setName("Joe");
		
		System.out.println("Students :" + s2.getAge());
		System.out.println("Students :" + s2.getName());
		
		System.out.println("Teacher :" + s2.getTeacher1().getAge());
		System.out.println("Teacher :" + s2.getTeacher1().getName());
		
		
	}

}

class Teacher1 implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int Age;
	
	private String Name;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
}

class Students1 implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int Age;
	
	private String Name;
	
	private Teacher1 teacher1;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Teacher1 getTeacher1() {
		return teacher1;
	}

	public void setTeacher1(Teacher1 teacher1) {
		this.teacher1 = teacher1;
	}
	
	public Object deepCopy() throws Exception
	{
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return ois.readObject();
		
	}
	
}