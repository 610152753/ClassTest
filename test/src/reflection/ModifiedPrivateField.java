package reflection;

import java.lang.reflect.Field;

public class ModifiedPrivateField
{

	public static void main(String[] args) throws Exception
	{
		PrivateField p = new PrivateField();
		
		Class<?> classType = p.getClass();
		
		Field field = classType.getDeclaredField("name");
		
		/**
		 * Exception in thread "main" java.lang.IllegalAccessException: Class reflection.ModifiedPrivateField can not access a member of class reflection.PrivateField with modifiers "private"
		 * 	at sun.reflect.Reflection.ensureMemberAccess(Unknown Source)
		 * 	at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(Unknown Source)
		 * 	at java.lang.reflect.AccessibleObject.checkAccess(Unknown Source)
		 * 	at java.lang.reflect.Field.set(Unknown Source)
		 * 	at reflection.ModifiedPrivateField.main(ModifiedPrivateField.java:16)
		 */
		
		//禁止java的访问控制检查

		field.setAccessible(true);
		
		field.set(p, "aaaa");
		
		System.out.println(p.getName());
		
	}


}
