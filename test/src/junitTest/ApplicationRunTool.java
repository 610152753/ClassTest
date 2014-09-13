package junitTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ApplicationRunTool {
	
//	public void run(String className) throws Exception
	public void run(Class<?> classType) throws Exception
	{
		//获取类的class对象
//		Class<?> classType = Class.forName(className);
		
		//生产类的实例对象
		Object invokeTester = classType.newInstance();
		
		//获取声明的方法
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method  mthd: methods)
		{
			System.out.println(mthd);
			if(mthd.isAnnotationPresent(AnnotationTestTool.class) && mthd.getParameterCount() == 0
					&& "void".equals(mthd.getReturnType().toString())) 
			{
				//调用这个对象的方法
				try {
					mthd.setAccessible(true);   //禁止java的访问控制检查
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
