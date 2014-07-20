package proxyDynamic;

import java.lang.reflect.Proxy;

public class Proxy1Client
{
	public static void main(String[] args)
	{
		Proxy1impl p1 = new Proxy1impl();
		
		Proxy1InvocationHandler handler = new Proxy1InvocationHandler();
		
		handler.setRealObj(p1);
		
//		Class<?> classType = handler.getClass();
		
		Proxy1Iterface proxy1 =  (Proxy1Iterface)Proxy.newProxyInstance(Proxy1Iterface.class.getClassLoader(), 
				new Class[] { Proxy1Iterface.class }, handler);
		
		String str =  proxy1.setRealSub();
		
		System.out.println(str);
		
		System.out.println("---------------------------");
		
		Proxy1impl2 p2 = new Proxy1impl2();
		
		handler.setRealObj(p2);
		
		proxy1 = (Proxy1Iterface)Proxy.newProxyInstance(Proxy1Iterface.class.getClassLoader(), 
				new Class[] {Proxy1Iterface.class}, handler);
		
		str =  proxy1.setRealSub();
		
		System.out.println(str);
		
		
		
		
	}

}
