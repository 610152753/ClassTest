package generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		
		list.add("String");
		list.add(new Integer(1));
		list.add(new Boolean(false));
		
		String str = (String)list.get(0);
		Integer in = (Integer)list.get(1);
		String b = (String)list.get(2);
		
		/**
		 * Exception in thread "main" java.lang.ClassCastException: java.lang.Boolean cannot be cast to java.lang.String
	at generics.ArrayListTest.main(ArrayListTest.java:18)
		 */
		
		
		
	}
}
