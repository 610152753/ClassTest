package ioTest;

import java.io.RandomAccessFile;

public class RandomAccessFile1 {
	
	public static void main(String[] args) throws Exception {
		
		Person p = new Person(10,"Joeどうして",170.1);
		
		RandomAccessFile raf = new RandomAccessFile("RandomAccessFile.txt", "rw");
		
		p.Write(raf);
		
		raf.seek(0);
		
		Person p1 = new Person();
		
		p1.Read(raf);
		
		System.out.println(p1.id + ", " + p1.Name + ", " + p1.height );
		
	}

}
class Person
{
	int id;
	String Name;
	Double height;
	
	
	
	public int getI() {
		return id;
	}



	public void setI(int id) {
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


	public Person()
	{
		
	}
	
	public Person(int id ,String name,double height)
	{
		this.id = id;
		this.Name = name;
		this.height = height;
	}
	
	public void Write(RandomAccessFile raf) throws Exception
	{
		raf.writeInt(this.id);
		raf.writeUTF(this.Name);
		raf.writeDouble(this.height);
	}
	
	public void Read(RandomAccessFile raf) throws Exception
	{
		this.id = raf.readInt();
		this.Name = raf.readUTF();
		this.height = raf.readDouble();
	}
	
	
}