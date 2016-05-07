package reflection;

import java.lang.reflect.Method;

public class CallPrivateMethod
{
	public static void main(String[] args) throws Exception
	{
		PrivateMember p = new PrivateMember();
		
		Class<?> classType = p.getClass();

		Method method = classType.getDeclaredMethod("getMessage",new Class[]{String.class});
		
		
		/**
		 * 
		 * Exception in thread "main" java.lang.NoSuchMethodException: reflection.PrivateMember.getMessage(java.lang.String)
		 * 	at java.lang.Class.getMethod(Unknown Source)
		 * at reflection.CallPrivateMethod.main(CallPrivateMethod.java:13)
		 * 
		 */
		
		method.setAccessible(true);   //禁止java的访问控制检查
		
		String str = (String)method.invoke(p, new Object[]{"li si"});
		
		System.out.println(str);
		
	}

}
