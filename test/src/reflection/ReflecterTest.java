package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * 
 * 若想通过类的不带参数的构造方法来生成对象，我们有两种方式
 * 1.先获取Class对象，然后通过该Class对象的newInstance()方法直接生产即可
 * 
 * 2.先获取Class对象，然后通过该对象获取对应的Constructor对象，在通过该Constructor对象
 * 的newInstance()方法生产
 * 
 * 若想通过类的带参数的构造方法来生成对象，见下面
 * 
 * 先获取Class对象，然后通过该对象获取对应的Constructor(new Class[]{Long.class,String.class})对象，再通过该Constructor对象
 * 的newInstance(new Object[]{ 2,"hel"})方法生产
 * 
 * @author JoePotter
 *
 */
public class ReflecterTest
{
	//该方法实现对Customer对象的拷贝操作
	
	public Object copy(Object object) throws Exception
	{
		
		Class<?> classType = object.getClass();
		
		System.out.println(classType);
		
		System.out.println("--------------------");
		
		System.out.println(classType.getName());
		
		Constructor cons = classType.getConstructor(new Class[]{});
		
		Object obj = cons.newInstance(new Object[]{});
		
		//以上两行代码等价与下面一行
		
		Object obj2 = classType.newInstance();
		
		System.out.println(obj);
		
		System.out.println("------------------------");
		
		System.out.println(obj2);
		
		
		System.out.println("---------------带参数");
		
		//带参数的
		
		Constructor cons1 = classType.getConstructor(new Class[]{Long.class,String.class});
		
		Object objreturn = cons1.newInstance(new Object[]{Long.parseLong("22"),"AAAA"});
		
		System.out.println(objreturn);
		
		Field[] fields = classType.getFields();
		
		for(Field field : fields)
		{
			
			String name = field.getName();
			
			String firstLetter = name.substring(0,1).toUpperCase();
			
			String GetMethodName = "get" + firstLetter + name.substring(1);
			String SetMethodName = "set" + firstLetter + name.substring(1);
			
			Method getMethod = classType.getMethod(GetMethodName, new Class[]{});
			Method setMethod = classType.getMethod(SetMethodName, new Class[]{field.getType()});
			
			Object value = getMethod.invoke(object,new Object[]{});
			setMethod.invoke(objreturn, new Object[] {value});
			
		}
		
		return objreturn;
	}
	
	public static void main(String[] args) throws Exception
	{
		
	    ReflecterTest reflecterTest = new ReflecterTest();
		System.out.println("==========第一次调用===============");
		Object ob1 =  reflecterTest.copy(new Customer());
	
		
		
		System.out.println(((Customer)ob1).getAge());
		System.out.println(((Customer)ob1).getName());
	
	
		System.out.println("=============第二次调用==============");
		
		
		Customer cus = new Customer(Long.parseLong("10"),"dddd");
		
		cus.setId(2L);
		cus.setAge(90);
		
		
		Object ob2 =  reflecterTest.copy(cus);
		
		System.out.println(((Customer)ob2).getAge());
		System.out.println(((Customer)ob2).getName());
		System.out.println(((Customer)ob2).getId());
	
	}

}

class Customer
{
	public Long Id;
	
	public String Name;
	
	public int Age;
	
	public Customer()
	{
		
	}

	public Customer(Long id,String Name)
	{
		this.Id = id;
		this.Name = Name;
	}

	public Long getId()
	{
		return Id;
	}

	public void setId(Long id)
	{
		Id = id;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public int getAge()
	{
		return Age;
	}

	public void setAge(int age)
	{
		Age = age;
	}

}

