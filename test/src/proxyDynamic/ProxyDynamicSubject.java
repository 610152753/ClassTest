package proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * �ô�����ڲ�������Object���ͣ�ʵ��ʹ�õ�ʱ��ͨ�����췽������һ������
 * ���⣬���໹ʵ����Ivoke�������÷����е�method.invoke��ʵ���ǵ��ñ���������ִ�еķ���������������obj
 * ��ʾ�÷���������obj,ͨ����̬�����࣬���ǿ�����ִ������ʵ�����ǰ������Լ���һЩ����Ĵ��롣
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
		method.invoke(obj, args);  //���÷��������Ҫ���õķ���
		return null;
	}

}
