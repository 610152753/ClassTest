package collection;

import java.util.ArrayList;

public class ArrayListTest2
{
    public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(new Integer(2));
		
		String str = (String)list.get(0);
		Integer in = (Integer)list.get(1);
//		String in1 = (String)list.get(1); java.lang.Integer cannot be cast to java.lang.String
		System.out.println(str);
		System.out.println(in);
//		System.out.println(in1);
	}
}
