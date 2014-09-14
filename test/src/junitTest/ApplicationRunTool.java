package junitTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * �Լ�ʵ�ּ򵥵�Junit����
 * ʹ��ע����
 *
 */

public class ApplicationRunTool {
	
//	public void run(String className) throws Exception
	public Object run(Class<?> classType,Object obj[]) throws Exception
	{
		//��ȡ���class����
//		Class<?> classType = Class.forName(className);
		
		//�������ʵ������
		Object invokeTester = classType.newInstance();
		
		//��ȡ�����ķ���
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method  mthd: methods)
		{
			if(mthd.isAnnotationPresent(AnnotationTestTool.class) 
					&& mthd.getParameterCount() == 2
//					&& "void".equals(mthd.getReturnType().toString())) 
					)
			{
				//�����������ķ���
				try {
					mthd.setAccessible(true);   //��ֹjava�ķ��ʿ��Ƽ��
					
					if (mthd.getParameterCount() > 0) {
						Object ret = (Integer) mthd.invoke(invokeTester, obj);
						return ret;
					} else {
						int ret = (Integer) mthd.invoke(invokeTester);
						return ret;
					}
					
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
		
	}

}
