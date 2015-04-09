package cloneTest;

public class CloneTest2 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		teacher tc1 = new teacher();
		
		tc1.setAge(50);
		tc1.setName("Teacher Zhan");
		
		Student1 sd1 = new Student1(tc1);
		
		sd1.setAge(10);
		sd1.setName("Student Li");
		
		Student1 sd2 = (Student1)sd1.clone();
		
		System.out.println(sd2.getName()+ ":" + sd2.getAge());
		System.out.println(sd2.getT1().getName() + ":" + sd2.getT1().getAge());
		
		System.out.println("------------------------------------");
		
		
		tc1.setName("Teacher Ma");
		
		sd1.setName("Student Zhang");
		
		System.out.println(sd2.getName()+ ":" + sd2.getAge());
		System.out.println(sd2.getT1().getName() + ":" + sd2.getT1().getAge());
		
		
		
	}

}

class teacher implements Cloneable
{
	
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
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Student1 implements Cloneable
{
	
	private int Age;
	
	private String Name;
	
	private teacher t1;
	
	public Student1(teacher t)
	{
		this.t1 = t;
	}

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

	public teacher getT1() {
		return t1;
	}

	public void setT1(teacher t1) {
		this.t1 = t1;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Student1 student1 = (Student1)super.clone();
		
		student1.setT1((teacher)student1.getT1().clone());
		
		return student1;
	}
	
	
}
