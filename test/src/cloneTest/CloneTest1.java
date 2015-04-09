package cloneTest;

/**
 * 
 * 深复制（深克隆）：被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。
 * 那些引用其他对象的变量将指向被复制过的新对象，而不再是原有的那些被引用的对象。
 * 换言之，深复制把要复制的对象所引用的对象都复制了一遍。
 * 
 * –clone方法将对象复制了一份并返回给调用者。一般而言，clone（）方法满足：
 * –①对任何的对象x，都有x.clone() !=x
 * •克隆对象与原对象不是同一个对象
 * –②对任何的对象x，都有x.clone().getClass()= =x.getClass()
 * •克隆对象与原对象的类型一样
 * –③如果对象x的equals()方法定义恰当，那么x.clone().equals(x)应该成立。
 * 
 * 
 * –①为了获取对象的一份拷贝，我们可以利用Object类的clone()方法。
 * –②在派生类中覆盖基类的clone()方法，并声明为public【Object类中的clone()方法为protected的】。
 * –③在派生类的clone()方法中，调用super.clone()。
 * –④在派生类中实现Cloneable接口。
 * 
 * @author Joe
 *
 */
public class CloneTest1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student();
		
		s1.setAge(10);
		s1.setName("Xiao Ming");
		
		Student s2 = (Student)s1.clone();
		
		System.out.println(s2.getName() + ":" + s2.getAge());
		
		System.out.println("-------------------------------");
		
		s2.setName("Li Si");
		s1.setAge(20);  //
		
		System.out.println(s2.getName() + ":" + s2.getAge());
		
		/**
		 * 
		 * Xiao Ming:10
		 * -------------------------------
		 * Li Si:10
		 * 
		 */
		
	}

}

class Student implements Cloneable
{
	private int age;
	
	private String Name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
