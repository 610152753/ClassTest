package junitTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * 自己实现简单的Junit工具
 * 使用注解来
 *
 */

public class ApplicationRunTool {
	
//	public void run(String className) throws Exception
	public Object run(Class<?> classType,Object obj[]) throws Exception
	{
		//获取类的class对象
//		Class<?> classType = Class.forName(className);
		
		//生产类的实例对象
		Object invokeTester = classType.newInstance();
		
		//获取声明的方法
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method  mthd: methods)
		{
			if(mthd.isAnnotationPresent(AnnotationTestTool.class) 
					&& mthd.getParameterCount() == 2
//					&& "void".equals(mthd.getReturnType().toString())) 
					)
			{
				//调用这个对象的方法
				try {
					mthd.setAccessible(true);   //禁止java的访问控制检查
					
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
