package reflection;

import java.lang.reflect.Method;

public class InvokeTester
{
	public int add(int param1, int param2)
	{
		return param1 + param2;
	}
	
	public String echo(String message)
	{
		return "hello: " + message;
	}
	
	public static void main(String[] args) throws Exception
	{
//		InvokeTester test = new InvokeTester();
//		System.out.println(test.add(1, 2));
//		System.out.println(test.echo("tom"));
		
		//获取类的class对象
		Class<?> classType = InvokeTester.class;
		
		//生产类的实例对象
		Object invokeTester = classType.newInstance();
		
		System.out.println(invokeTester instanceof InvokeTester);
		
		//获取对应实例的方法
		Method addMethod = classType.getMethod("add", new Class[]{int.class,int.class});
		
		//调用invokeTester这个对象的addMethod这个方法
		Object result = addMethod.invoke(invokeTester, new Object[]{1,3});
		
		System.out.println((Integer)result);
		
		System.out.println("-------------------------------");
		
		Method echoMethod = classType.getMethod("echo", new Class[]{String.class});
		
		Object result1 =  echoMethod.invoke(invokeTester, "tom !");
		
		System.out.println((String)result1);
		
	}
}
