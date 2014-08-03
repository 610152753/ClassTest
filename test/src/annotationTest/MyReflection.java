package annotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection
{
	public static void main(String[] args) throws Exception
	{
		MyTest test = new MyTest();
		
		Class<MyTest> c = MyTest.class;
		
//		Class<?> c = test.getClass();
		
		Method method = c.getDeclaredMethod("output",new Class[] {});
		
		if(method.isAnnotationPresent(MyAnnotation.class))
		{
		  method.invoke(test, new Object[]{});
		  
		  MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
		  
		  String address = myAnnotation.address();
		  
		  String world = myAnnotation.world();
		  
		  System.out.println(address + "," + world);
		  
		}
		
		Annotation[] annotations = method.getAnnotations();
		
		for(Annotation annotationelement: annotations)
		{
			System.out.println(annotationelement.annotationType().getName());
		}
		
	}

}
