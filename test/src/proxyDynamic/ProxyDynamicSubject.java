package proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * 该代理的内部属性是Object类型，实际使用的时候通过构造方法传递一个对象，
 * 此外，该类还实现了Ivoke方法，该方法中的method.invoke其实就是调用被代理对象的执行的方法，方法参数是obj
 * 表示该方法从属于obj,通过动态代理类，我们可以在执行其真实对象的前后加入自己的一些额外的代码。
 *
 */

public class ProxyDynamicSubject implements InvocationHandler
{

	private Object obj;
	
	public ProxyDynamicSubject(Object obj)
	{
		this.obj = obj;
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		method.invoke(obj, args);  //利用反射调用需要调用的方法
		return null;
	}

}
