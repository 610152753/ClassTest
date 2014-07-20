package reflection;

import java.lang.reflect.Array;

public class ArrayTestReflection
{
	public static void main(String[] args) throws Exception
	{
		Class<?> classType = Class.forName("java.lang.String");
		
		Object array = Array.newInstance(classType, 10);
		
		Array.set(array, 4, "ArrayTest");
		
		String str = (String)Array.get(array, 4);
		
		System.out.println(str);
	}

}
