package proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * 
 * 
 * ��̬������
 *1.����һ��ʵ�ֽӿ�InvocationHandler���࣬������ʵ��invoke����
 *2.��������������Լ��ӿ�
 *3.ͨ��Proxy�ľ�̬���� newProxyInstance(ClassLoader loader,
 * Class[] interfaces,InvocationHandler h)����һ������
 *4.ͨ��������÷���
 *
 *
 */

public class VectorProxy implements InvocationHandler
{
	private Object Proxyobject;
	
	public VectorProxy(Object obj)
	{
		this.Proxyobject = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("before calling :" + method);
		
		if(null != args)
		{
			for(Object objre: args)
			{	
			  System.out.println(objre);
			}
		}
		Object obj = method.invoke(Proxyobject, args);
		
		System.out.println("after calling  :" + method);
		return obj;
	}

	
	public static Object factory(Object obj)
	{
		Class<?> classType = obj.getClass();
		
		return Proxy.newProxyInstance(classType.getClassLoader(), obj.getClass().getInterfaces(), 
				new VectorProxy(obj));
	}
	
	
	
	public static void main(String[] args)
	{
		List v = (List)factory(new Vector());
		
		System.out.println(v.getClass().getName());
		
		v.add("new");
		
		System.out.println("----------------------------");
		
		v.add("old");
		
		System.out.println(v);
		
		v.remove(0);
		
		System.out.println(v);
	}
	
	
}
