package proxyTest;

import java.lang.reflect.Method;

public class ClassTest
{

	public static void main(String[] args) throws Exception
	{
		
		Class<?> classType = Child.class;
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
		
		Method  method = classType.getMethod("ToString",new Class[] {String.class});
		
		System.out.println("------------------");
		
		Object obj = classType.newInstance();
		
		System.out.println("------------------");
		
		String str = (String)method.invoke(obj,"Test");
		
		System.out.println(str);
		
		System.out.println("-----------------");
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
		
		System.out.println("-----------------");
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
	}
	
}

class Parent
{
	public  Parent()
	{
		System.out.println("Parent Class !");
	}
	
	public String ToString(String str)
	{
		return "Parent return :" + str;
	}
}

class Child extends Parent
{
	public Child()
	{
		System.out.println("This is Child !");
	}
}
