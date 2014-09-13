package junitTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ApplicationRunTool {
	
//	public void run(String className) throws Exception
	public void run(Class<?> classType) throws Exception
	{
		//��ȡ���class����
//		Class<?> classType = Class.forName(className);
		
		//�������ʵ������
		Object invokeTester = classType.newInstance();
		
		//��ȡ�����ķ���
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method  mthd: methods)
		{
			System.out.println(mthd);
			if(mthd.isAnnotationPresent(AnnotationTestTool.class) && mthd.getParameterCount() == 0
					&& "void".equals(mthd.getReturnType().toString())) 
			{
				//�����������ķ���
				try {
					mthd.setAccessible(true);   //��ֹjava�ķ��ʿ��Ƽ��
					mthd.invoke(invokeTester);
					
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}

		}
		
	}

}
