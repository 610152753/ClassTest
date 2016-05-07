package proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * 
 * 
 * 动态代理步骤
 *1.创建一个实现接口InvocationHandler的类，它必须实现invoke方法
 *2.创建被代理的类以及接口
 *3.通过Proxy的静态方法 newProxyInstance(ClassLoader loader,
 * Class[] interfaces,InvocationHandler h)创建一个代理
 *4.通过代理调用方法
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
