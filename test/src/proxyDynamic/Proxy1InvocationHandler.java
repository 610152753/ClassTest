package proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy1InvocationHandler implements InvocationHandler
{

	private Object realObj;
	
	public Proxy1InvocationHandler(Object obj)
	{
		this.realObj = obj;
	}
	
	public Proxy1InvocationHandler()
	{
	}
	
	
	public void setRealObj(Object realObj)
	{
		this.realObj = realObj;
	}



	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
	 	Object obj =  method.invoke(realObj, args);
		return obj;
	}

}
