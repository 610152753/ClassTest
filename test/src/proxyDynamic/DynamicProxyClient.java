package proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyClient
{
	public static void main(String[] args)
	{
		RealSubject realSubject = new RealSubject();
		
		InvocationHandler handler = new ProxyDynamicSubject(realSubject);
		
		Class<?> classType = handler.getClass();
		//�������һ���������������
		
		Subject subject = (Subject) Proxy.newProxyInstance(classType.getClassLoader(), 
				realSubject.getClass().getInterfaces(), handler);
		subject.request();
	}

}
